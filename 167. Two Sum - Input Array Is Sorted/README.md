# 167. Two Sum II - Input Array Is Sorted

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
**Language:** Java

## Problem

Given a sorted array, find two numbers that add up to a target value and return their 1-indexed positions.

## Approach

Two pointers starting at opposite ends of the sorted array. Move the left pointer forward when the sum is too small and the right pointer backward when the sum is too large, until the target sum is reached.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
