# Rising Brains

Website URL: [Rising Brains DSA Sheet](https://risingbrain.org/sheet)

## Arrays

Fundamental collection of elements stored at contiguous memory locations.

### Two Pointers

Problem involves pairs, sorted arrays, triplets, or opposite-end traversal.

Use two indices that move towards or away from each other to reduce redundant comparisons.

1. Two Sum II:

    Problem URL: [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/)

    **Given:**

    - An array of integers (Sorted)
    - An integer target

    **Output:**

    Traverse through the Arrays and find the index position of 2 elements that sums up to the Target and return their `index + 1` position as an Array.

    **Solution:**

    - Initialize `left=0` & `right=arr_length`
    - Loop through the array while `left < right`
    - For each loop
        - find the sum of element at `left` & `right` index
        - compare the sum with the `Target`
        - if `Target == sum` return a list with `left + 1` and `right + 1`
        - if `Target > sum` do `left + 1`
        - if `Target < sum` do `right - 1`

2. Three Sum:

    Problem URL: [Three Sum](https://leetcode.com/problems/3sum/description/)

    **Given**:
    
    - An array of integers

    **Output**:

    An Array of Array with integers that sums up to zero, The array should contain duplicate arrays.

    Solution:

    1. Initialize a `List<List<Integers>>` as result
    2. Initialize a For loop starting from `0` and ending at `len - 2` as `left`
    3. Check if `left > 0` && `arr[left - 1] == arr[left]` do `continue`
    4. Initialize `mid = left + 1` & `right = len - 1` in the `For` loop
    5. Initialize a While loop with condition `mid < right`
    6. Get the `sum = arr[left] + arr[mid] + arr[right]`
    7. If `sum == 0`
       1. Add `arr[left], arr[mid], arr[right]` to the result.
       2. Initialize a While Loop with condition `mid < right` && `arr[mid] == arr[mid + 1]` and body as `mid++`
       3. Initialize a While Loop with condition `mid < right` && `arr[right] == arr[right - 1]` and body as `right--`
       4. Finally do `mid++` and `right--`
    8. Else if `sum > 0` do `right--`
    9. Else do `mid++`