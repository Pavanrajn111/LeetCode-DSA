class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeft(nums,target);
        int right = findRight(nums,target);
        int[] ans = new int[2];
        ans[0] = left;
        ans[1] = right;
        return ans;
        
    }
    public int findLeft(int[] nums,int target){
        int start = 0,end = nums.length-1;
        int ans = -1;
        while(start<=end)
        {
            int mid = (start + end)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid] > target)
            {
                end = mid - 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public int findRight(int[] nums , int target){
          int start = 0,end = nums.length-1;
          int ans = -1;
        while(start<=end)
        {
            int mid = (start + end)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid] > target)
            {
                end = mid - 1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}

