package lab6.problem1;
import java.util.Arrays;


// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
    private final int INITIAL_LENGTH = 3;
    private Person[] PersonArray;
    private int size;

    // Default Constructor
    public MyPersonList() {
        PersonArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // 1. Implement method to Add as last element, make sure you have enough room else call resize()
    public void add(Person s) {
        if(s == null) return;
        //check if array is full
        if(size == PersonArray.length)
        //Array is full
        resize();
        //Add at the end of the list
        PersonArray[size] = s;
        size++; //increment indenx to insert the new element

    

    }

    // 2. get person information by passing index
    public Person get(int i) {
        if(i<0|| i>size-1)
        return null;
        return PersonArray[i];
    }

    // 3. Find the Person object using lastname
    public boolean find(String lastName) {
        //check if lastName is null
        if(lastName == null)
            return false;
        for(int i =0; i<size; i++)
        {
            if(lastName.equals(PersonArray[i])){
                return true;
            }
        }
        //element is not in a list
        return false; 
    }

    // 4. Remove the person object by passing its lastname
    public boolean remove(String lastName) {
        if(size == 0){
            return false;
        }
        if(lastName == null){
            return false;
        }

        int index = -1;

        for(int i =0; i<size; ++i){
            if(PersonArray[i].equals(lastName)){
                index = i;
                break;
            }

        }

        if(index == -1)
           return false;
        Person[] temp = new Person[PersonArray.length];

        System.arraycopy(PersonArray,0,temp,0,index);
        System.arraycopy(PersonArray, index+1, temp, index,PersonArray.length-(index +1));
        PersonArray = temp;
        --size;
        return true;

    }
    // 5. Resizing the list
    private void resize() {

        int len  = PersonArray.length;
        int newLen = 2*len;
        PersonArray = Arrays.copyOf(PersonArray,newLen);

    }
    // To display all the persons list
    @Override
    public String toString() {
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
        list.remove("Tom");
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        System.out.println("\nSearching of Lermon: " + list.find("Lermon"));
        System.out.println(list.get(2));
    }
}
