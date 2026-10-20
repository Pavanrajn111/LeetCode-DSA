# 1046. Last Stone Weight

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/last-stone-weight/
**Language:** Java

## Problem

Given an array of stones, repeatedly smash the two heaviest stones together. If their weights differ, the remaining stone has the difference in weight. Return the last stone's weight, or 0 if no stones remain.

## Approach

Use a max-heap to keep the heaviest stones at the top. Repeatedly remove the two heaviest stones and, when their weights differ, add their difference back to the heap. The remaining heap value is the answer.

## Complexity

- **Time:** O(n log n)
- **Space:** O(n)
