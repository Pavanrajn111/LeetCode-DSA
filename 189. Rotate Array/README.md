# 189. Rotate Array

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/rotate-array/
**Language:** Java

## Problem

Rotate an array to the right by `k` steps, in place.

## Approach

Three-reversal trick: reverse the entire array, then reverse the first `k` elements, then reverse the remaining elements. The combination produces the rotated array without any extra storage.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
