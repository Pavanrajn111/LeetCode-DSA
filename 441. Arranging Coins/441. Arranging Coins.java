class Solution {
    public int arrangeCoins(int n) {
       double value = 2 * (long)n + 0.25;
       double result = Math.sqrt(value) - 0.5;
       int res = (int) result;
       return res;

    }
}