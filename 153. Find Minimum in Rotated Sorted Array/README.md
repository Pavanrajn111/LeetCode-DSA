# 153. Find Minimum in Rotated Sorted Array

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
**Language:** Java

## Problem

Given a sorted array of unique elements that has been rotated between 1 and n times, return the minimum element in the array.

The algorithm must run in O(log n) time.

## Approach

Use binary search. Compare the middle element with the first element. If it is greater than or equal to the first element, the minimum is in the right half; otherwise, the middle element may be the minimum, so continue searching the left half. Track the smallest candidate found during the search.

## Complexity

- **Time:** O(log n)
- **Space:** O(1)
