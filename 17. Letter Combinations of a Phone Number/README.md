# 17. Letter Combinations of a Phone Number

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/letter-combinations-of-a-phone-number/
**Language:** Java

## Problem

Given a string containing digits from `2` to `9`, return all possible letter combinations that the number could represent. The combinations can be returned in any order.

Each digit maps to the letters on a telephone keypad. The digits `7` and `9` map to four letters; all other digits from `2` to `8` map to three letters.

### Examples

**Example 1:**

```text
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

**Example 2:**

```text
Input: digits = "2"
Output: ["a","b","c"]
```

## Approach

Use backtracking to build each combination one digit at a time. For the current digit, try each letter mapped to it, then recursively process the next digit. When all digits have been processed, add the completed string to the result.

## Complexity

- **Time:** O(n * 4^n), where `n` is the number of digits
- **Space:** O(n) auxiliary space for the recursion stack, excluding the result
