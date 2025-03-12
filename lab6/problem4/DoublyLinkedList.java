package lab6.problem4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        //implement
        Node newNode = new Node(item);
        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
    }


    // 2. Remove by passing object
    public boolean remove(String item) {
        //Implement
        Node current = header.next;
        while (current != null) {
            if (current.value.equals(item)) {
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        // Implement
        if (header.next == null) {
            return false;
        }
        header.next = header.next.next;
        if (header.next != null) {
            header.next.previous = header;
        }
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        // Implement
        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        while (current != header) {
            System.out.print(current.value + " ");
            current = current.previous;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        sb.append(n.value).append(" ");
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        @Override
        public String toString() {
            return value == null ? "null" : value;
        }

        Node() {
        }

        Node(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

        // Call all your implemented Methods
        list.addLast("Carol");
        System.out.println(list); // Expected: Bob Bill Tom Carol

        list.remove("Bill");
        System.out.println(list); // Expected: Bob Tom Carol

        list.removeFirst();
        System.out.println(list); // Expected: Tom Carol

        list.printReverse(); // Expected: Carol Tom
    }
}
