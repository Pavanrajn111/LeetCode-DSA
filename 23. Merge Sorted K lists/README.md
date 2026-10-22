# 23. Merge k Sorted Lists

**Difficulty:** Hard
**LeetCode:** https://leetcode.com/problems/merge-k-sorted-lists/
**Language:** Java

## Problem

You are given an array of `ListNode` objects, where each list is sorted in ascending order. Merge all the linked lists into a single sorted linked list and return it.

## Approach

Use a min-heap to always keep track of the smallest current node among all lists.

1. Insert the head of each non-null list into a priority queue.
2. Repeatedly remove the smallest node from the heap.
3. Append it to the merged result.
4. If that node has a next element, push that next node into the heap.
5. Continue until the heap is empty.

This guarantees that the output list is built in sorted order while keeping only the current front of each list in memory at any time.

## Complexity

- **Time:** O(n log k)
- **Space:** O(k)

Here, `k` is the number of linked lists and `n` is the total number of nodes across all lists.
