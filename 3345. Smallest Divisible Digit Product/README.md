# 3345. Smallest Divisible Digit Product

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/smallest-divisible-digit-product/
**Language:** Java

## Problem

Given a starting number `n` and a value `t`, find the smallest number greater than or equal to `n` whose digit product is divisible by `t`.

## Approach

Start from `n` and, for each candidate, compute the product of its digits and check whether it is divisible by `t`; increment the candidate until the condition holds.

## Complexity

- **Time:** O(k * d) where k is the search distance and d the digit count
- **Space:** O(1)
