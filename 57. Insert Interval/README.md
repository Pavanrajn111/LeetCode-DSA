# 57. Insert Interval

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/insert-interval/
**Language:** Java

## Problem

Insert a new interval into a sorted list of non-overlapping intervals, merging where necessary.

## Approach

Walk through and keep every interval that ends before the new interval starts, merge every interval that overlaps the new interval into it, then append the new interval followed by the remaining ones.

## Complexity

- **Time:** O(n)
- **Space:** O(n)
