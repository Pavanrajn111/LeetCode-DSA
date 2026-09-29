# 46. Permutations

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/permutations/
**Language:** Java

## Problem

Given an array `nums` of distinct integers, return all possible permutations. The answer can be returned in any order.

### Examples

**Example 1:**

```text
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

**Example 2:**

```text
Input: nums = [0,1]
Output: [[0,1],[1,0]]
```

**Example 3:**

```text
Input: nums = [1]
Output: [[1]]
```

### Constraints

- `1 <= nums.length <= 6`
- `-10 <= nums[i] <= 10`
- All integers in `nums` are unique.

## Approach

Use backtracking to build each permutation one number at a time. Track which numbers are already in the current permutation, skip those numbers, and recurse with each unused number. When the permutation reaches the input length, add a copy of it to the result; then backtrack to try the next choice.

## Complexity

- **Time:** O(n * n!)
- **Space:** O(n) auxiliary space, excluding the result