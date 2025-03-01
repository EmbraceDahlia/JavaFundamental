package lab3;

public class Palindrome {
    private static int reverseNumber(int num, int reversedNum) {
        if (num == 0) {
            return reversedNum;
        }
        reversedNum = (reversedNum * 10) + (num % 10);
        return reverseNumber(num / 10, reversedNum);
    }

    public static boolean isPalindromeNumber(int num) {
        if (num < 0) return false;
        int reversedNum = reverseNumber(num, 0);
        return reversedNum == num;
    }

    public static void main(String[] args) {
        int n = 44;
        System.out.printf("%d %s a palindrome number.", n, isPalindromeNumber(n) ? "is" : "isn't");
    }
}
