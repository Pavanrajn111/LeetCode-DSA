# 435. Non-overlapping Intervals

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/non-overlapping-intervals/
**Language:** Java

## Problem

Given a set of intervals, find the minimum number of intervals that must be removed so that the rest do not overlap.

## Approach

Greedy: sort the intervals by end time, then keep the interval with the earliest end whenever an overlap is found, counting how many intervals must be removed as a result.

## Complexity

- **Time:** O(n log n)
- **Space:** O(1)
