# 199. Binary Tree Right Side View

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/binary-tree-right-side-view/
**Language:** Java

## Problem

Given the root of a binary tree, return the values visible when looking at the tree from the right side, ordered from top to bottom.

## Approach

Use breadth-first search to process the tree one level at a time. Add the last node visited at each level to the result, since it is the rightmost node on that level. Enqueue each node's left child before its right child so the last node processed is the one visible from the right.

## Complexity

- **Time:** O(n), where n is the number of nodes
- **Space:** O(w), where w is the maximum number of nodes at any level
