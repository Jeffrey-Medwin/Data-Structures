package arrays.twopointers;

public class MoveZeros {

    public void solution(int[] arr) {

        int left = 0;
        int right = left;

        while (arr.length > 1 && right < arr.length) {
            
            if (arr[right] != 0) {
                swap(arr, left, right);
                left++;
            }
            
            right++;
        }
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
