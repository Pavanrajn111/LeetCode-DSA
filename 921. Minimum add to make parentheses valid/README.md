# 921. Minimum Add to Make Parentheses Valid

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
**Language:** Java

## Problem

Find the fewest parentheses that must be inserted into a string so that it becomes valid.

## Approach

Scan the string while tracking the current balance of opening and closing parentheses. When a closing parenthesis makes the balance negative, count an insertion of an opening parenthesis and reset the balance. Add the remaining positive balance as the needed closing parentheses.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
