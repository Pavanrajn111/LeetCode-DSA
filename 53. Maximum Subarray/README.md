# 53. Maximum Subarray

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/maximum-subarray/
**Language:** Java

## Problem

Find the contiguous subarray with the largest sum.

## Approach

Kadane's algorithm: reset the running sum to zero whenever it drops below zero, and keep track of the best sum seen at every step.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
