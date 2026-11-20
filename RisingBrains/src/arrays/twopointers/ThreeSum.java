package arrays.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/description/
public class ThreeSum {


    public List<List<Integer>> solution(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        // Two Pointer Approach requires sorted array
        Arrays.sort(nums);

        for (int left = 0; left < n - 2; left++) {
            // ignoring the duplicate values
            if (left > 0 && nums[left] == nums[left - 1]) {
                continue;
            }

            int mid = left + 1;
            int right = n - 1;

            while (mid < right) {

                int sum = nums[left] + nums[mid] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[left], nums[mid], nums[right]));

                    // ignoring the duplicate values
                    while (mid < right && nums[mid] == nums[mid + 1]) {
                        mid++;
                    }
                    
                    // ignoring the duplicate values
                    while (mid < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // moving the pointer to required value
                    mid++;
                    right--;
                } else if (sum < 0) {
                    mid++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

}
