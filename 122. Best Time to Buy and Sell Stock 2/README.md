# 122. Best Time to Buy and Sell Stock II

**Difficulty:** Medium
**LeetCode:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
**Language:** Java

## Problem

You are given an integer array `prices` where `prices[i]` is the price of a given stock on the `ith` day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day, ensuring you never hold more than one share.

Find and return the maximum profit you can achieve.

## Approach

Scan the prices once and track the start of each rising price sequence as a buy price. When the price stops rising, sell at the previous day's price and add that sequence's profit. After the scan, add the profit from any final rising sequence.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
