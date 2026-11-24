package arrays.twopointers;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestContainerWithMostWater {

    private ContainerWithMostWater containerWithMostWater = null;

    @BeforeEach 
    public void setup() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    public void testCaseOne() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int expected = 49;

        assertEquals(expected, containerWithMostWater.solution(height));
    }

    @Test 
    public void testCaseTwo() {
        int[] height = {1, 1};

        int expected = 1;

        assertEquals(expected, containerWithMostWater.solution(height));
    }

}
