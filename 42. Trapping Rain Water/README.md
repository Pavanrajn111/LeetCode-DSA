# 42. Trapping Rain Water

**Difficulty:** Hard
**LeetCode:** https://leetcode.com/problems/trapping-rain-water/
**Language:** Java

## Problem

Given an elevation map, compute how much rainwater it can trap.

## Approach

Precompute the maximum height to the left and to the right of every index. The water trapped above each index equals the smaller of those two maximums minus the height at that index.

## Complexity

- **Time:** O(n)
- **Space:** O(n)
