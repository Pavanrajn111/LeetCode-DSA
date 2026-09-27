class Solution {
    public int maxProduct(int[] nums) {
        int maxP = nums[0];
        int minP = nums[0];
        int result = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                maxP = Math.max(nums[i],maxP*nums[i]);
                minP = Math.min(nums[i],minP*nums[i]);
            }
            else
            {
                int temp = maxP;
                maxP = Math.max(nums[i],minP*nums[i]);
                minP = Math.min(nums[i],temp*nums[i]);
            }
            result = Math.max(result,maxP);
        }
        return result;
    }
}