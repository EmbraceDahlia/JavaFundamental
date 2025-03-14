package lab9.problem1;

public class TestMain {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();

// Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Queue after enqueue operations: " + queue);

        // Peek front element
        System.out.println("Peek: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);

        // Test resizing
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(100);
        queue.enqueue(110);
        queue.enqueue(120);

        System.out.println("Queue after multiple enqueues (resize expected): " + queue);
    }


}
