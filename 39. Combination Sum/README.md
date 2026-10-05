# 39. Combination Sum

[LeetCode problem 39: Combination Sum](https://leetcode.com/problems/combination-sum/) — **Medium**

## Problem

Given distinct positive integers `candidates` and a target, return every unique combination whose values sum to the target. Each candidate can be used any number of times. The order of values within a combination does not create a new combination.

## Approach

Process the candidates in order. For each candidate, try every possible count from zero through the maximum count that fits in the remaining target, then recursively process the next candidate. When all candidates have been considered, save the combination if the remaining target is zero.

Because each recursive call advances to the next candidate, combinations are built in a consistent candidate order and duplicates are avoided. The current combination is backtracked after each recursive call so the next count can be tried.

## Complexity

- **Time:** Proportional to the number of candidate-count choices explored and the combinations copied into the result.
- **Space:** `O(n + target / min(candidates))` auxiliary space in the worst case, excluding the returned combinations, for recursion depth `n` and the working combination.

## Solution

See [`39. Combination Sum.java`](./39.%20Combination%20Sum.java).
