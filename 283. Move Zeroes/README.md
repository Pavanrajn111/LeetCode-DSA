# 283. Move Zeroes

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/move-zeroes/
**Language:** Java

## Problem

Move all zeroes in an array to the end while keeping the relative order of the non-zero elements, in place.

## Approach

Two-pointer swap: a pointer tracks the position where the next non-zero value should go, and every non-zero element found while scanning is swapped into that position.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
