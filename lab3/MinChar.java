package lab3;

public class MinChar {
    public char findMinimumCharacter(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        return findMinimumCharacter(s, 0, s.charAt(0));

    }

    private char findMinimumCharacter(String s, int index, char minChar) {
        if (index == s.length()) {
            return minChar;
        }
        char currentLetter = s.charAt(index);
        if (currentLetter < minChar) {
            return findMinimumCharacter(s, index + 1, currentLetter);
        } else {
            return findMinimumCharacter(s, index + 1, minChar);
        }

    }

    public static void main(String[] args) {
        MinChar minChar = new MinChar();
        System.out.println(minChar.findMinimumCharacter("akel"));
    }
}
