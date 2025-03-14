package lab9.problem1;



public class ArrayQueueImpl {

    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    ArrayQueueImpl() {
        this.arr = new Integer[DEFAULT_CAPACITY];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    ArrayQueueImpl(int capacity) {
        if (capacity <= 0) {
        throw new IllegalArgumentException("Queue capacity must be greater than 0");
    }
        this.arr = new Integer[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;

    }

    // Returns the front element without removing it
    public Integer peek() {
        return isEmpty() ? null : arr[front];
    }

    public void enqueue(Integer obj) {
        if (obj == null) return;

        if (size == arr.length) {
            resize();
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = obj;
        size++;

    }

    // Removes and returns the front element
    public Integer dequeue() {
        if (isEmpty()) return null;

        Integer dequeued = arr[front];

        arr[front] = null;

        front = (front + 1) % arr.length;
        size--;

        return dequeued;

    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return size == 0;

    }

    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = arr.length * 2;
        Integer[] newArr = new Integer[newCapacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size - 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        int index = front;
        for (int i = 0; i < size; i++) {
            sb.append(arr[index]);
            if (i < size - 1) sb.append((", "));
            index = (index + 1) % arr.length;
        }

        sb.append("]");
        return sb.toString();
    }

}
