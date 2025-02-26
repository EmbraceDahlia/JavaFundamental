package lab1;

import java.util.Arrays;

public class Prog5 {
    private static int[] combine(int[] a, int[] b){
        int[] c = Arrays.copyOf(a,a.length+b.length);
        System.arraycopy(b,0,c,a.length,b.length);
        return c;
    }
    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = { 3,8,9,11};
        int[] combinedArray = combine(a,b);
        System.out.println("Array 1: "+Arrays.toString(a));
        System.out.println("Array 2: "+Arrays.toString(b));
        System.out.println("Array 1 + Array 2: "+Arrays.toString(combinedArray));
    }
}
