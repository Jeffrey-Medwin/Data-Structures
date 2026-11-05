package arrays.twopointers;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumII {

    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int target1 = 9;

        System.out.println("Solution 1: " + Arrays.toString(solution(arr1, target1)));

        int[] arr2 = {2,3,4};
        int target2 = 6;

        System.out.println("Solution 2: " + Arrays.toString(solution(arr2, target2)));


        int[] arr3 = {-1, 0};
        int target3 = -1;

        System.out.println("Solution 3: " + Arrays.toString(solution(arr3, target3)));
    }

    private static int[] solution(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[] {++left, ++right};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }

        }

        return new int[]{-1, -1};
    }

}
