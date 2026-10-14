# 100. Same Tree

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/same-tree/
**Language:** Java

## Problem

Determine whether two binary trees are structurally identical and have the same value at every corresponding node.

## Approach

Compare the roots recursively. If both nodes are null, the corresponding subtrees match; if only one is null or their values differ, the trees do not match. Otherwise, both the left and right subtrees must match.

## Complexity

- **Time:** O(n), where n is the number of nodes in the smaller tree
- **Space:** O(h), where h is the maximum tree height due to recursion
