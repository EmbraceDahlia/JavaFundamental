package lab5.problem1;

import java.util.Arrays;
import java.util.Random;

public class MyPersonList {
    private final int INITIAL_LENGTH = 3;
    private Person[] PersonArray;
    private int size;

    public MyPersonList() {
        PersonArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // 1. Implement method to Add as last element, make sure you have enough room else call resize()
    public void add(Person s) {
        if (s == null) return;
        if (size == PersonArray.length) resize();
        PersonArray[size++] = s;
    }

    // 2. get person information by passing index
    public Person get(int i) {
        if (i < 0 || i > size - 1) return null;
        return PersonArray[i];
    }

    // 3. Find the Person object using lastname
    public boolean find(String lastName) {
        if (lastName == null) return false;
        for (int i = 0; i < size; i++) {
            if (lastName.equals(PersonArray[i].getLast())) return true;
        }
        return false;
    }

    // 4. Remove the person object by passing its lastname
    public boolean remove(String lastName) {
        if (size == 0 || PersonArray == null) return false;
        for (int i = 0; i < size; i++) {
            if (lastName.equals(PersonArray[i].getLast())) {
                for (int j = i; j < size - 1; j++)
                    PersonArray[j] = PersonArray[j + 1];
                PersonArray[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void insert(Person p, int pos) {
        if (pos >= size || pos < 0)
            return;
        if (p == null) return;
        if (size == PersonArray.length) {
            resize();
        }
        // Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            PersonArray[i] = PersonArray[i - 1];
        }
        // Insert the new element
        PersonArray[pos] = p;
        size++;
    }


    // 5. Resizing the list
    private void resize() {
        int newSize = PersonArray.length * 2;
        PersonArray = Arrays.copyOf(PersonArray, newSize);
    }

    // To display all the persons list
    public String toString() {
        if(size == 0) return "List is empty.";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(PersonArray[i] + ", \n");
        }
        sb.append(PersonArray[size - 1] + "]");
        return sb.toString();
    }

    // Return the size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Bruce", "Tom", 36));
        list.add(new Person("Paul", "Corozza", 51));
        list.add(new Person("Joe", "Lermon", 53));
        list.add(new Person("Anne", "Dow", 55));
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        if (list.remove("Tom"))
            System.out.println("Removed Tom");
        System.out.println("Size() : " + list.size() + "\n" + list);
        System.out.println("\nSearching of Lermon: " + list.find("Lermon"));
        System.out.println("Getting a person at index 2: "+list.get(2));
    }
}
