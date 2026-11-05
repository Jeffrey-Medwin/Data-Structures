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

    - An Arrays of number (Sorted)
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
