# 11. Container With Most Water

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/container-with-most-water/
**Language:** Java

## Problem

Given an array of heights representing vertical lines, find the two lines that, together with the x-axis, form the container that holds the most water.

## Approach

Two pointers starting at both ends of the array. At each step compute the area using the shorter of the two lines, track the best area seen so far, and move the pointer at the shorter line inward, since moving the taller one can never improve the result.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
