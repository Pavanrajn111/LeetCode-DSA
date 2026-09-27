# 121. Best Time to Buy and Sell Stock

**Difficulty:** Easy
**LeetCode:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
**Language:** Java

## Problem

Given an array of stock prices indexed by day, find the maximum profit that can be made from a single buy followed by a later sell.

## Approach

Single pass while tracking the minimum price seen so far. At every day, update the best possible profit as the difference between the current price and that running minimum.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
