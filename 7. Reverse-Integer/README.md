# 7. Reverse Integer

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/reverse-integer/
**Language:** Java

## Problem

Reverse the digits of a signed 32-bit integer, returning 0 if the reversed value overflows.

## Approach

Repeatedly pull the last digit off the number with `% 10` and `/ 10` while building up the reversed value, then check the result against the 32-bit integer range before returning it.

## Complexity

- **Time:** O(log n)
- **Space:** O(1)
