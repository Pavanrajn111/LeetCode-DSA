# 212. Word Search II

**Difficulty:** Hard

**LeetCode:** https://leetcode.com/problems/word-search-ii/

**Language:** Java

## Problem

Given an `m x n` board of characters and a list of strings, return all words that can be formed on the board. Each word must use sequentially adjacent cells, where adjacent cells are horizontal or vertical neighbors. A cell cannot be used more than once in the same word.

## Approach

Insert all words into a trie, then run depth-first search from each board cell that matches a trie root character. During each search, continue only through neighboring cells whose letters are children of the current trie node. Mark each visited board cell temporarily so it cannot be reused in that path, and restore it after exploring. When a trie node marks the end of a word, add that word to the result and clear its end marker to avoid returning duplicates.

## Complexity

- **Time:** O(m * n * 4 * 3^(L - 1)) in the worst case, where `L` is the maximum word length; trie prefix pruning typically reduces the search.
- **Space:** O(S + L), where `S` is the total number of characters in all words (trie storage) and `L` accounts for the DFS recursion stack, excluding the result.
