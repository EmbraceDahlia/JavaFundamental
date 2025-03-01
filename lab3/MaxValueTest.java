package lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxValueTest {

    @Test
    void testFindMaxValue() {

        int[] arr = {5,2,8,-1,6};
        int[] emptyArr = {};

        int maxVal = MaxValue.findMaxValue(arr);
        int expectedValue = 8;
        assertEquals(expectedValue,maxVal);
        int maxVal2 = MaxValue.findMaxValue(emptyArr);
        assertEquals(0, maxVal2);
    }
    @Test
    void testEmptyArray(){
    int[] emptyArry ={};
    assertEquals(0,MaxValue.findMaxValue(emptyArry));
}
    @Test
    void testSingleElement(){
        int[] arr ={5};
        assertEquals(5, MaxValue.findMaxValue(arr));
    }

    @Test
    void testPositiveNumbers(){
        int[] arr = {3,1,7,4,9,2};
        assertEquals(9,MaxValue.findMaxValue(arr));
    }

    @Test
    void testDuplicates(){
        int[] arr ={4, 2, 4, 8, 8, 1};
        assertEquals(8,MaxValue.findMaxValue(arr));
    }



}



