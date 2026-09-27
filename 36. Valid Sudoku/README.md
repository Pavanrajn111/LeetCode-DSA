# 36. Valid Sudoku

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/valid-sudoku/
**Language:** Java

## Problem

Determine whether a partially filled 9x9 Sudoku board is valid: no digit may repeat in any row, column, or 3x3 sub-box.

## Approach

Keep a hash set for every row, column, and 3x3 box. For each filled cell, check whether the digit already exists in the corresponding row/column/box set before adding it - a match in any of the three means the board is invalid.

## Complexity

- **Time:** O(1) (fixed 9x9 board)
- **Space:** O(1)
