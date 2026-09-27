# 35. Search Insert Position

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/search-insert-position/
**Language:** Java

## Problem

Find the index of a target value in a sorted array, or the index where it would be inserted to keep the array sorted.

## Approach

Standard binary search. If the loop finishes without finding the target, the `low` pointer has landed exactly on the correct insertion index.

## Complexity

- **Time:** O(log n)
- **Space:** O(1)
