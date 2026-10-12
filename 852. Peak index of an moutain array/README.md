# 852. Peak Index in a Mountain Array

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/peak-index-in-a-mountain-array/
**Language:** Java

## Problem

Given a mountain array, return the index of its peak. A mountain array strictly increases to one peak and then strictly decreases.

## Approach

Scan adjacent elements from left to right. The first position where the current element is greater than the next element is the peak index.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
