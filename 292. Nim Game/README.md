# 292. Nim Game

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/nim-game/
**Language:** Java

## Problem

Determine whether the first player can guarantee a win when each turn removes 1 to 3 stones from a heap.

## Approach

The first player loses when the initial number of stones is divisible by 4. Otherwise, remove enough stones to leave a multiple of 4, then mirror the opponent's moves to maintain that position.

## Complexity

- **Time:** O(1)
- **Space:** O(1)
