package lab8.problem1;

import java.util.Arrays;

public class ArrayQueueImpl {

    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    //default
    ArrayQueueImpl() {
        this.arr = new Integer[DEFAULT_CAPACITY];
        this.front =0;
        this.rear = -1;
        this.size =0;
    }

    //parametirised
    ArrayQueueImpl(int size, Integer[] arr, int front, int rear) {
        this.size = size;
        this.arr = (arr == null || arr.length ==0)? new Integer[DEFAULT_CAPACITY]:Arrays.copyOf(arr, arr.length);
        this.front = front;
        this.rear = rear;

    }

   
    public Integer peek() {
        if (size != 0) {
            return arr[front];
        }
        return null;
    }

    public void enqueue(Integer obj) {
        if(obj ==null){
            return;
        }
        if (size == arr.length) {
            resize();
        }
        rear = (rear + 1) % arr.length;

        arr[rear] = obj;

        size++;

        System.out.println(Arrays.toString(arr) + "equiing");


    }

    public Integer dequeue() {
        //array is empty
        if (size == 0) {
            return null;
        }
        Integer dequeued = arr[front];

        front = (front + 1) % arr.length;
        size--;
        return dequeued;

    }

    public boolean isEmpty() {
        return size == 0;

    }

    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = arr.length * 2;
        arr = Arrays.copyOf(arr, newCapacity);
    }

    @Override
    public String toString() {
/* Return data in this format, each element separated by comma with in [ ] eg:
[10, 20, 30, 40, 50, 60 ]*/
        if (size == 0) return "[]";
        int index = front;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[index]);
            if (i < size - 1) sb.append((","));
            index = (index + 1) % arr.length;
        }

        sb.append("]");
        return sb.toString();
    }

}
