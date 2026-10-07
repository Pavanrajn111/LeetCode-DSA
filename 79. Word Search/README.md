# 79. Word Search

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/word-search/
**Language:** Java

## Problem

Given an `m x n` grid of characters and a word, determine whether the word can be formed from sequentially adjacent cells. Adjacent cells must be horizontal or vertical neighbors, and each cell may be used at most once.

## Approach

Run a depth-first search from each cell that matches the first character. At each step, search the four neighboring cells for the next character. Mark a cell as visited while exploring it, then restore its original character before returning so it can be used by other search paths.

## Complexity

- **Time:** O(m * n * 3^L), where `L` is the word length
- **Space:** O(L) for the recursion stack
