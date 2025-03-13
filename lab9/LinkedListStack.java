package lab9;

import java.util.LinkedList;

public class LinkedListStack {

    LinkedList<Integer> list = new LinkedList<>();

    public void push(Integer x) {
        if (x == null)
            return;
        list.addLast(x);
    }

    public Integer peek() {
        // returns null if stack is empty
        if (list.isEmpty()) {
            return null;
        }
        return list.getLast();
    }

    public Integer pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeLast();
    }

    public boolean isEmpty() { // true if stack is empty
        return list.isEmpty();
    }

    public int size() { // returns number of items in the stack
        return list.size();
    }

    @Override
    public String toString() {
        if (list.isEmpty())
            return "<empty>";
        StringBuilder sb = new StringBuilder();
        for (Integer x : list) {
            if (x != null)
                sb.append(x.toString()).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListStack listStack = new LinkedListStack();
        listStack.push(1);
        listStack.push(2);
        System.out.println(listStack);
        System.out.println("Size = " + listStack.size());
        System.out.println(listStack.isEmpty());
        listStack.pop();
        System.out.println(listStack);
        listStack.pop();
        System.out.println(listStack);
    }

}
