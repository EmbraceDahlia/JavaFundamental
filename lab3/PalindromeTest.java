package lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void testPalindromeNumbers() {
        assertTrue(Palindrome.isPalindromeNumber(121), "121 should be a palindrome");
        assertTrue(Palindrome.isPalindromeNumber(44),"44 should be a palindrome");
        assertTrue(Palindrome.isPalindromeNumber(0),"0 should be a palindrome");

    }

    @Test
    void testNonPalindromes() {

        assertFalse(Palindrome.isPalindromeNumber(1255),"123 should not be a palindrome");
        assertFalse(Palindrome.isPalindromeNumber(10),"10 should not be a palindrome");
        assertFalse(Palindrome.isPalindromeNumber(100),"100 should not be a palindrome");

    }

    @Test
    void testNegativeNumbers() {
        assertFalse(Palindrome.isPalindromeNumber(-121),"-121 should not be a palindrome");
        assertFalse(Palindrome.isPalindromeNumber(-1),"-1 should not be a palindrome" );
        assertFalse(Palindrome.isPalindromeNumber(-101),"-101 should not be a palindrome");
    }

    @Test
    void testLargeNumbers() {
        assertTrue(Palindrome.isPalindromeNumber(123454321),"123454321 should be a palindrome");
    }

}