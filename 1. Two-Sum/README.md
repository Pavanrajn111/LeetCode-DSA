# 1. Two Sum

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/two-sum/
**Language:** Java

## Problem

Given an array of integers and a target value, find the indices of the two numbers that add up to the target. Each input has exactly one valid answer, and the same element may not be used twice.

## Approach

Brute force over every pair of indices: for each index `i`, scan every later index `j` and check whether `nums[i] + nums[j]` equals the target, returning the pair as soon as a match is found.

## Complexity

- **Time:** O(n^2)
- **Space:** O(1)
