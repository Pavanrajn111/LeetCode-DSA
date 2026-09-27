# 485. Max Consecutive Ones

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/max-consecutive-ones/
**Language:** Java

## Problem

Find the maximum number of consecutive 1s in a binary array.

## Approach

Single pass keeping a running streak counter that resets to zero on a 0 and is compared against the best streak seen so far on every 1.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
