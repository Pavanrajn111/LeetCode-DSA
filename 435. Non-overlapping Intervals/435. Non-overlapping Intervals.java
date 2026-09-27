class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length == 0)
        {
            return 0;
        }
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int end = intervals[0][1];
        for(int i = 1;i< intervals.length ;i++)
        {
            int[] interval = intervals[i];
            if(interval[0] < end)
            {
                count++;
            }else
            {
                end = interval[1];
            }
        }
        return count;
    }
}