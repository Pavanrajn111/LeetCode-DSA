# 226. Invert Binary Tree

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/invert-binary-tree/
**Language:** Java

## Problem

Invert a binary tree by swapping the left and right child of every node, then return the root.

## Approach

Recursively invert each node's original left and right subtrees, then assign the inverted left subtree to the right child and the inverted right subtree to the left child. Return the root after all swaps.

## Complexity

- **Time:** O(n), where n is the number of nodes
- **Space:** O(h), where h is the tree height due to recursion
