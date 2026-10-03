# 135. Candy

**Difficulty:** Hard
**LeetCode:** https://leetcode.com/problems/candy/
**Language:** Java

## Problem

Assign at least one candy to each child in a line so that any child with a higher rating than an adjacent child receives more candies. Return the minimum total number of candies required.

## Approach

Initialize every child with one candy. Scan from left to right to give a child more candies than the previous child when their rating is higher. Then scan from right to left, increasing a child's count when needed to satisfy the right neighbor while preserving any larger count assigned in the first scan. Sum the resulting counts.

## Complexity

- **Time:** O(n)
- **Space:** O(n)
