# 13. Roman to Integer

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/roman-to-integer/
**Language:** Java

## Problem

Convert a Roman numeral string into its equivalent integer value.

## Approach

Walk through the string mapping each character to its numeral value. Whenever a numeral is smaller than the one right after it, subtract it from the running total; otherwise add it, mirroring the subtractive-notation rule of Roman numerals.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
