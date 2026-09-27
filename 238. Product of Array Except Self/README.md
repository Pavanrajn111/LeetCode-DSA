# 238. Product of Array Except Self

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/product-of-array-except-self/
**Language:** Java

## Problem

Return an array where each element is the product of every other element in the input, without using division.

## Approach

Build a prefix-product array and a suffix-product array in two passes, then multiply the corresponding prefix and suffix value for each index to get the final answer.

## Complexity

- **Time:** O(n)
- **Space:** O(n)
