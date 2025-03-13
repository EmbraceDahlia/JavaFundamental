package lab5.problem4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    public void addFirst(String item) {
        if (item == null) return;
        Node n = new Node(header, item, header.next);
        if (header.next != null) header.next.previous = n;
        header.next = n;
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        if (item == null) return;
        Node n = new Node(item);
        Node current = header;
        while (current.next != null) current = current.next;
        current.next = n;
        n.previous = current;
    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        if (item == null || header.next == null) return false;
        Node current = header.next;
        while (current != null) {
            if (current.value.equals(item)) {
                if (current.previous != null)
                    current.previous.next = current.next;
                if (current.next != null)
                    current.next.previous = current.previous;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        if (header == null || header.next == null) return false;
        header.next = header.next.next;
        if (header.next != null)
            header.next.previous = header;
        return true;
    }

    // 4. Prints the list from last to first
    public void printReverse() {
        System.out.println("Printing reverse");
        if (header != null && header.next != null) {
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
//            this(null);
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
        System.out.println("List" + list.toString());

        // Call all your implemented Methods
        if (list.remove("Harry"))
            System.out.println("Removed Harry");
        if (list.removeFirst())
            System.out.println("Removed first element");
        list.addLast("Jennie");
        System.out.println("Added Jennie");
        System.out.println("Before reverse:" + list);
        list.printReverse();
    }
}

