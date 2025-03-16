package lab9.problem2;

public class LinkedListStack {

    Node top;
    int size;

    LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(Integer data) {
        if (data == null) return;
        Node newNode = new Node(data);
        if (top == null) top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        size++;
        System.out.printf("Added %d %n", data);
    }

    public Integer peek() {
        if (isEmpty()) return null;
        System.out.print("Peek: ");
        return top.data;
    }

    public Integer pop() {
        if (isEmpty()) return null;
        Integer poppedData = top.data;
        top = top.next;
        size--;
        System.out.printf("Removed %d %n", poppedData);
        return poppedData;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
        }
    }

    @Override
    public String toString() {
        if (this.top == null)
            return "Stack: <empty>";
        StringBuilder sb = new StringBuilder();
        Node current = this.top;
        System.out.print("Stack: ");
        while (current != null) {
            sb.append(current.data.toString()).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListStack listStack = new LinkedListStack();
        for (int i = 1; i <= 5; i++)
            listStack.push(i*10);
        System.out.println(listStack);
        System.out.println(listStack.peek());
        System.out.println("Size: " + listStack.size());
        System.out.println("Is stack empty? " + listStack.isEmpty());
        listStack.pop();
        System.out.println(listStack);
        listStack.pop();
        System.out.println(listStack);
        listStack.pop();
        listStack.pop();
        listStack.pop();
        listStack.pop();
        System.out.println("Is stack empty? " + listStack.isEmpty());
        System.out.println(listStack);
    }

}
