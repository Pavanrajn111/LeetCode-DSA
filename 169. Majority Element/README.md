# 169. Majority Element

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/majority-element/
**Language:** Java

## Problem

Given an array, find the element that appears more than n/2 times.

## Approach

Boyer-Moore voting algorithm: keep a running candidate and a counter, incrementing the counter when the current value matches the candidate and decrementing it otherwise; a new candidate is chosen whenever the counter reaches zero.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
