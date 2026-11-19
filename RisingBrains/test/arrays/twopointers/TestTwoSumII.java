package arrays.twopointers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwoSumII {

    private TwoSumII twoSumII = null;

    @BeforeEach 
    public void setup() {
        twoSumII = new TwoSumII();
    }


    @Test 
    public void testCaseOne() {
        int[] numbers   = {2, 7, 11, 15};
        int target      = 9;

        int[] expected  = {1, 2};

        assertArrayEquals(expected, twoSumII.solution(numbers, target));
    }


    @Test
    public void testCaseTwo() {
        int[] numbers   = {2, 3, 4};
        int target      = 6;

        int[] expected  = {1, 3};

        assertArrayEquals(expected, twoSumII.solution(numbers, target));
    }


    @Test 
    public void testCaseThree() {
        int[] numbers   = {-1, 0};
        int target      = -1;

        int[] expected  = {1, 2};

        assertArrayEquals(expected, twoSumII.solution(numbers, target));
    }
}
