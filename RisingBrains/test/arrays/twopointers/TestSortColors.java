package arrays.twopointers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSortColors {

    private SortColors sortColors = null;

    @BeforeEach 
    public void setup() {
        sortColors = new SortColors();
    }


    @Test 
    public void testCaseOne() {
        int[] arr = {2, 0, 2, 1, 1, 0};

        int[] expected = {0, 0, 1, 1, 2, 2};

        sortColors.solution(arr);
        assertArrayEquals(expected, arr);
    }
    
    
    @Test 
    public void testCaseTwo() {
        int[] arr = {2, 0, 1};

        int[] expected = {0 ,1, 2};

        sortColors.solution(arr);
        assertArrayEquals(expected, arr);
    }
}
