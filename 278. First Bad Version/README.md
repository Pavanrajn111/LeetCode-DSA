# 278. First Bad Version

**Difficulty:** Easy  
**LeetCode:** https://leetcode.com/problems/first-bad-version/  
**Language:** Java

## Problem

Given versions numbered from `1` to `n`, find the first version that is bad. A version is bad if the `isBadVersion` API returns `true`; every version after the first bad version is also bad. Minimize the number of API calls.

## Approach

Use binary search over the version range. If the middle version is bad, it could be the first bad version, so continue searching the left half. Otherwise, the first bad version must be to its right. When the search bounds meet, that version is the first bad one.

## Complexity

- **Time:** O(log n) API calls
- **Space:** O(1)
