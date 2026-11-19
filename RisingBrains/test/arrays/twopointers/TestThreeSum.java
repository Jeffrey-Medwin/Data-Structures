package arrays.twopointers;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestThreeSum {

    private ThreeSum threeSum = null;

    @BeforeEach 
    void setup() {
        threeSum = new ThreeSum();
    }


    @Test 
    void testCaseOne() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1));

        assertEquals(expected, threeSum.solution(nums));
    }


    @Test 
    void testCaseTwo() {
        int[] nums = new int[]{0, 1, 1};

        List<List<Integer>> expected = new ArrayList<>();

        assertEquals(expected, threeSum.solution(nums));
    }


    @Test 
    void testCaseThree() {
        int[] nums = new int[]{0, 0, 0};

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));

        assertEquals(expected, threeSum.solution(nums));
    }

}
