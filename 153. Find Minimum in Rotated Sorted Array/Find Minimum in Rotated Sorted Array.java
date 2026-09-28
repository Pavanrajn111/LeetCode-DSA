class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        int ans = nums[0];
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(nums[mid] >= nums[0])
            {
                start = mid + 1;
            }else
            {
                ans = nums[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
}