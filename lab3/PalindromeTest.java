package lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {



    @Test
    void testPalindromeNumbers() {
        assertTrue(Palindrome.isPalindromeNumber(121));
        assertTrue(Palindrome.isPalindromeNumber(44));
        assertTrue(Palindrome.isPalindromeNumber(0));

    }
    @Test
    void testNonPalindromes() {

        assertFalse(Palindrome.isPalindromeNumber(1255));
        assertFalse(Palindrome.isPalindromeNumber(10));
        assertFalse(Palindrome.isPalindromeNumber(100));

    }

    @Test
    void testNegativeNumbers() {
        assertFalse(Palindrome.isPalindromeNumber(-121));
        assertFalse(Palindrome.isPalindromeNumber(-1));
        assertFalse(Palindrome.isPalindromeNumber(-101));
    }

    @Test
    void testLargeNumbers() {
        assertTrue(Palindrome.isPalindromeNumber(123454321));
    }

}