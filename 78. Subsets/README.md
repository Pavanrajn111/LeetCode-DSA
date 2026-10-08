# 78. Subsets

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/subsets/
**Language:** Java

## Problem

Given an array `nums` of unique integers, return all possible subsets (the power set). The result must not contain duplicate subsets and can be returned in any order.

### Examples

**Example 1:**

```text
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
```

**Example 2:**

```text
Input: nums = [0]
Output: [[],[0]]
```

## Approach

Use backtracking to consider each number in two ways: exclude it from the current subset or include it. Once every number has been considered, add a copy of the current subset to the result.

## Complexity

- **Time:** O(n * 2^n)
- **Space:** O(n) auxiliary space, excluding the result
