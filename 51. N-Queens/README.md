# 51. N-Queens

**Difficulty:** Hard  
**LeetCode:** https://leetcode.com/problems/n-queens/  
**Language:** Java

## Problem

Place `n` queens on an `n x n` chessboard so that no two queens attack each other. Return every distinct valid board configuration, using `'Q'` for a queen and `'.'` for an empty square.

### Examples

**Example 1:**

```text
Input: n = 4
Output: [
  [".Q..","...Q","Q...","..Q."],
  ["..Q.","Q...","...Q",".Q.."]
]
```

**Example 2:**

```text
Input: n = 1
Output: [["Q"]]
```

### Constraints

- `1 <= n <= 9`

## Approach

Use backtracking to place one queen in each row. For each column in the current row, check that the column and both upward diagonals contain no queen. If the position is safe, place a queen and recursively process the next row. When all rows have a queen, convert the board into strings and add it to the results. Remove each queen after exploring its branch so the next placement can be tried.

## Complexity

- **Time:** O(n * n!), as each candidate placement checks up to `n` board positions and the column constraint limits complete placements to at most `n!`.
- **Space:** O(n^2) for the board, excluding the returned solutions; the recursion uses O(n) additional space.
