class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int ans = 0;
        while(left < right)
        {
            int width = right - left;
            int heightOf = Math.min(height[left],height[right]);
            int area = width*heightOf;
            ans = Math.max(ans,area);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return ans;
    }
}