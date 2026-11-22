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

    1. Initialize `left=0` & `right=arr_length`
    2. Loop through the array while `left < right`
    3. For each loop
        1. find the sum of element at `left` & `right` index
        2. compare the sum with the `Target`
        3. if `Target == sum` return a list with `left + 1` and `right + 1`
        4. if `Target > sum` do `left + 1`
        5. if `Target < sum` do `right - 1`

2. Three Sum:

    Problem URL: [Three Sum](https://leetcode.com/problems/3sum/description/)

    **Given:**
    
    - An array of integers

    **Output:**

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
 
3. Sort Colors

    Problem URL: [Sort Colors](https://leetcode.com/problems/sort-colors/description/)

    **Given:**

    An Array of unordered integers.

    **Output:**

    As Array of sorted integers.

    **Solution:**

    1. Initialize `low = 0`, `mid = 0` & `high = len - 1`
    2. Initialize a While loop with condition `mid <= high`
    3. If `arr[mid] == 1` do `mid++`
    4. Else If `arr[mid] == 0` do 
       1. swap `arr[mid]` with `arr[left]`
       2. increment `mid` by `1`
       3. increment `left` by `1`
    5. Else
       1. swap `arr[mid]` with `arr[high]`
       2. decrement `high` by `1`

4. Move Zeros

    Problem URL: (Move Zeros)[https://leetcode.com/problems/move-zeroes/description/]

    **Given:**

    An array of integers

    **Output:**

    Move the zeros in the array to the end without changing the order of non-zeros

    **Solution:**

    1. Initialize `left = 0` & `right = 0`
    2. Initialize a while loop with condition `right < arr.len`
    3. if `arr[right] != 0` do
       1. swap `arr[right] & arr[left]`
       2. increment `left`
    4. increment `right`