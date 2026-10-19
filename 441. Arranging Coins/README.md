# 441. Arranging Coins

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/arranging-coins/
**Language:** Java

## Problem

Given n coins, form a staircase with k complete rows, where row i contains i coins. Return the number of complete rows that can be formed.

## Approach

Use the triangular number formula: k(k + 1) / 2 <= n. Solving this inequality for k gives floor(sqrt(2n + 0.25) - 0.5), which computes the largest complete row count directly.

## Complexity

- **Time:** O(1)
- **Space:** O(1)
