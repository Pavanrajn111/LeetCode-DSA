# 150. Evaluate Reverse Polish Notation

**Difficulty:** Medium
**LeetCode:** [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
**Language:** Java

## Problem

Evaluate an arithmetic expression given in Reverse Polish Notation and return its integer result. The supported operators are `+`, `-`, `*`, and `/`; integer division truncates toward zero.

## Approach

Use a stack to evaluate the tokens from left to right. Push each number onto the stack. When an operator appears, pop the right operand first and then the left operand, apply the operation in that order, and push the result. The final stack value is the expression result.

## Complexity

- **Time:** O(n), where n is the number of tokens
- **Space:** O(n) for the stack
