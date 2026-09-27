# 26. Remove Duplicates From Sorted Array

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/
**Language:** Java

## Problem

Remove duplicates from a sorted array in place so each unique value appears only once, and return the new length.

## Approach

Two pointers: a slow pointer marks where the next unique value should be written, while a fast pointer scans ahead and copies a value forward whenever it differs from the previous one.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
