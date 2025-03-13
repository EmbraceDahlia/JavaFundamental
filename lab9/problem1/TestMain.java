package lab8.problem1;

public class TestMain {
    public static void main(String[] args){
        ArrayQueueImpl queue = new ArrayQueueImpl(10,new Integer[]{10,20,30,40},0, 8);

        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        queue.enqueue(70);
        System.out.println(queue);
        




    }
}
