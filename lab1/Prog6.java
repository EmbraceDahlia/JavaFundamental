package lab1;

public class Prog6 {

    public static void secondMin(int[] arrayOfInts){
        int min = Integer.MAX_VALUE;
        int secondMin = min-1;
        for (int i=0;i<arrayOfInts.length;i++) {
            if (arrayOfInts[i] < secondMin && arrayOfInts[i] < min) {
                if (min == Integer.MAX_VALUE)
                    secondMin = arrayOfInts[i];
                else
                    secondMin = min;
                min = arrayOfInts[i];
            } else if (arrayOfInts[i] < secondMin && arrayOfInts[i] != min) {
                secondMin = arrayOfInts[i];
            }
        }
        System.out.println("The second minimum value is "+secondMin);
    }

    public static void main(String[] args) {
        int[] a = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(a);
    }
}
