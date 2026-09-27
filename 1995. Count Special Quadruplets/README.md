# 1995. Count Special Quadruplets

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/count-special-quadruplets/
**Language:** Java

## Problem

Count the number of index quadruples `i < j < k < l` such that `nums[i] + nums[j] + nums[k] == nums[l]`.

## Approach

Brute force over every combination of four indices, checking the sum condition directly with four nested loops.

## Complexity

- **Time:** O(n^4)
- **Space:** O(1)
