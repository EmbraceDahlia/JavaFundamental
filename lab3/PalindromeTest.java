package lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void testPalindromeNumbers() {
        assertTrue(Palindrome.isPalindromeNumber(121), "121 is a palindrome");
        assertTrue(Palindrome.isPalindromeNumber(44), "44 is a palindrome");
        assertTrue(Palindrome.isPalindromeNumber(0), "0 is a palindrome");
    }

    @Test
    void testNonPalindromes() {
        assertFalse(Palindrome.isPalindromeNumber(1255), "123 is not  a palindrome");
        assertFalse(Palindrome.isPalindromeNumber(10), "10 is not a palindrome");
        assertFalse(Palindrome.isPalindromeNumber(100), "100 is not a palindrome");
    }

    @Test
    void testNegativeNumbers() {
        assertFalse(Palindrome.isPalindromeNumber(-121), "-121 is not a palindrome");
        assertFalse(Palindrome.isPalindromeNumber(-1), "-1 is not a palindrome");
        assertFalse(Palindrome.isPalindromeNumber(-101), "-101 is not a palindrome");
    }

    @Test
    void testLargeNumbers() {
        assertTrue(Palindrome.isPalindromeNumber(123454321), "123454321 is a palindrome");
    }
}
