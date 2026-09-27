# 34. Find First and Last Position of Element in Sorted Array

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
**Language:** Java

## Problem

Find the starting and ending indices of a given target value in a sorted array.

## Approach

Two binary searches - one biased to keep searching left after a match to find the first occurrence, and one biased to keep searching right to find the last occurrence.

## Complexity

- **Time:** O(log n)
- **Space:** O(1)
