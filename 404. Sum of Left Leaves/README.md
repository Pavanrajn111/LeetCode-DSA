# 404. Sum of Left Leaves

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/sum-of-left-leaves/
**Language:** Java

## Problem

Given the root of a binary tree, return the sum of all left leaves. A leaf is a node with no children.

## Approach

Traverse the tree recursively while tracking whether each node is a left child. Add a node's value when it is both a left child and a leaf.

## Complexity

- **Time:** O(n), where n is the number of nodes
- **Space:** O(h), where h is the tree height due to recursion
