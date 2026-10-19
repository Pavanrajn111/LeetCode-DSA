# 124. Binary Tree Maximum Path Sum

**Difficulty:** Hard
**LeetCode:** https://leetcode.com/problems/binary-tree-maximum-path-sum/
**Language:** Java

## Problem

Given the root of a binary tree, return the maximum path sum. A path is a sequence of nodes connected by edges and may start and end at any nodes in the tree.

## Approach

Use a recursive depth-first search to find the maximum downward path sum from each node. Ignore negative child contributions, update the overall maximum with a path passing through the current node, and return the best single-branch path to its parent.

## Complexity

- **Time:** O(n), where n is the number of nodes
- **Space:** O(h), where h is the tree height due to recursion
