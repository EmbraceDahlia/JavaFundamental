package lab1;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        // String[] original = new String[] { "horse", "dog", "cat", "horse", "dog" };
        String[] original = new String[] { "Gideon", "Gideon", "Gideon", "horse",
                "Gideon" };
        String[] copy = new String[original.length];
        int copyCount = 0;
        for (int i = 0; i < original.length; i++) {
            String currentWord = original[i];
            boolean isInCopyArrayAlready = false;
            for (int j = 0; j < copyCount; j++) {
                if (currentWord == copy[j]) {
                    isInCopyArrayAlready = true;
                    break;
                }
            }
            if (isInCopyArrayAlready == false) {
                copy[copyCount] = currentWord;
                copyCount++;
            }
        }
        copy = Arrays.copyOf(copy, copyCount);
        System.out.println(Arrays.toString(copy));
    }
}
