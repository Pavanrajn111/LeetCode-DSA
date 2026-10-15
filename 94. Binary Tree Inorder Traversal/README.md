# 94. Binary Tree Inorder Traversal

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/binary-tree-inorder-traversal/
**Language:** Java

## Problem

Given the root of a binary tree, return the inorder traversal of its nodes' values.

## Approach

Traverse the tree recursively in left-root-right order. For each node, first visit its left subtree, then add its value to the result, and finally visit its right subtree. Return the collected values.

## Complexity

- **Time:** O(n), where n is the number of nodes
- **Space:** O(h), where h is the tree height due to recursion
