package arrays.twopointers;


// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumII {

    public int[] solution(int[] arr, int target) {

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
