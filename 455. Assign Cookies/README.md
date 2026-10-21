# 455. Assign Cookies

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/assign-cookies/
**Language:** Java

## Problem

Given children's greed factors and cookie sizes, assign at most one cookie to each child. A child is content if the assigned cookie is at least as large as their greed factor. Return the maximum number of content children.

## Approach

Sort both arrays in ascending order. Iterate through the cookies from smallest to largest, assigning each cookie to the least-greedy child who has not yet received a cookie whenever it is large enough. This greedy strategy uses each cookie effectively while preserving larger cookies for children with greater greed factors.

## Complexity

- **Time:** O(n log n + m log m), where `n` is the number of children and `m` is the number of cookies
- **Space:** O(1) auxiliary space, excluding the sorting implementation
