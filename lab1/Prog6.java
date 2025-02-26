package lab1;

public class Prog6 {

    public static void secondMin(int[] arrayOfInts) {
        if (arrayOfInts == null || arrayOfInts.length < 2) {
            System.out.println("The array should have at least 2 values to find the second minimum!");
            return;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < min) {
                secondMin = min;
                min = arrayOfInts[i];
            } else if (arrayOfInts[i] < secondMin && arrayOfInts[i] != min) {
                secondMin = arrayOfInts[i];
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum value!");
        } else {
            System.out.println("The second minimum value is " + secondMin + ".");
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(a);
    }
}
