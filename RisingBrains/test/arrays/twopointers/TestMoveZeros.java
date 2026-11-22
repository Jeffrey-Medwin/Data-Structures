package arrays.twopointers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMoveZeros {

    private MoveZeros moveZeros = null;

    @BeforeEach 
    public void setup() {
        moveZeros = new MoveZeros();
    }


    @Test 
    public void testCaseOne() {
        int[] arr = {1, 0, 3, 12, 0};

        int[] expected = {1, 3, 12, 0, 0};

        moveZeros.solution(arr);

        assertArrayEquals(expected, arr);
    }
}
