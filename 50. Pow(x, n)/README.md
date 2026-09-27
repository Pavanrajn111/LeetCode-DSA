# 50. Pow(x, n)

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/powx-n/
**Language:** Java

## Problem

Implement `pow(x, n)`, computing `x` raised to the integer power `n`.

## Approach

Recursive fast exponentiation: halve the exponent on every call and square the result, handling the odd-exponent case by multiplying in an extra factor of `x` and the negative-exponent case by dividing instead of multiplying.

## Complexity

- **Time:** O(log n)
- **Space:** O(log n) recursion stack
