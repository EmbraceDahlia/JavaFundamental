package lab1;

public class Prog2 {
    //Problem-2: Create a class called Prog2. Swap two numbers without using third variable.
    public static void main(String[] args){

        int a = 20;
        int b = 30;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a -b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

//        int temp = b;
//
//        b=temp;
//        temp = b;
//        a = temp;
//        System.out.println("a=" +a);
//        System.out.println("b=" + b);




    }

}
