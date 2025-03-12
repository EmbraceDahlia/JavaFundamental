package lab5.problem4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    public void addFirst(String item) {
        Node n = new Node(header, item, header.next);
        if (header.next != null) header.next.previous = n;
        header.next = n;
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        Node n = new Node(item);
        Node current = header;
        while (current.next != null) current = current.next;
        current.next = n;
        n.previous = current;
    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        if (header.next == null) return false;
        Node current = header.next;
        while (current != null) {
            if (current.value.equals(item)) {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        if (header.next == null) return false;
        header.next = header.next.next;
        return true;
    }

    // 4. Prints the list from last to first
    public void printReverse() {
        if (header.next != null) {
            Node current = header.next;
            while (current.next != null) current = current.next;

            while (current.previous != null) {
                System.out.print(current.value + " ");
                current = current.previous;
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public Node() {
            this(null);
        }

        public Node(String val) {
            this.value = val;
        }

        public Node(Node prev, String val, Node next) {
            this.value = val;
            this.previous = prev;
            this.next = next;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

        // Call all your implemented Methods
        list.remove("Harry");
        list.removeFirst();
//        list.addLast("Jennie");
//        list.addLast("Chaeyoung");
        list.printReverse();
    }
}

