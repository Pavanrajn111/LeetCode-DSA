# 152. Maximum Product Subarray

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/maximum-product-subarray/
**Language:** Java

## Problem

Given an integer array, find the contiguous subarray that produces the largest product.

## Approach

Dynamic programming that tracks both the maximum and minimum product ending at the current index, since multiplying by a negative number can turn the smallest running product into the new largest one. The overall answer is updated with the running maximum at every step.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
