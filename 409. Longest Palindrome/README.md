# 409. Longest Palindrome

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/longest-palindrome/
**Language:** Java

## Problem

Given a case-sensitive string of uppercase and lowercase letters, return the greatest length of a palindrome that can be formed using its characters.

## Approach

Count the occurrences of each character. Use all occurrences for even counts and the largest even number of occurrences for odd counts. If any count is odd, place one remaining character in the center of the palindrome.

## Complexity

- **Time:** O(n)
- **Space:** O(k), where k is the number of distinct characters
