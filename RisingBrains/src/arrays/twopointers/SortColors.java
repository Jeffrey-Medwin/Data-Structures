package arrays.twopointers;

// https://leetcode.com/problems/sort-colors/description/
public class SortColors {

    public void solution(int[] arr) {
        int low = 0;
        int mid = low;
        int high = arr.length - 1;

        while (mid <= high) {
            
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
