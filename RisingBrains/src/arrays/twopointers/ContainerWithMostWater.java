package arrays.twopointers;


public class ContainerWithMostWater {

    public int solution(int[] arr) {
        int maxWater = Integer.MIN_VALUE;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int length = arr[left] < arr[right] ? arr[left] : arr[right]; 
            int breadth = right - left;
            int water = length * breadth;

            maxWater = water > maxWater ? water : maxWater;

            if (arr[left] == length) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

}
