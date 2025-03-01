package lab3;

import java.util.Arrays;

/**
 * Assuming the given array isn't null
 */
public class ArrayReversal {

    private static void reverseArray(int[] a, int index) {
        int l = a.length;
        if (l < 2 || index >= l / 2) return;

        int temp = a[index];
        a[index] = a[l - 1 - index];
        a[l - 1 - index] = temp;

        reverseArray(a, index + 1);
    }

    public static void reverseArray(int[] a) {
        reverseArray(a, 0);
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 7, 9, 11, 13, 15, 17, 20};
        System.out.println("Before Reverse: " + Arrays.toString(a));
        reverseArray(a);
        System.out.println("After Reverse: " + Arrays.toString(a));
    }
}
