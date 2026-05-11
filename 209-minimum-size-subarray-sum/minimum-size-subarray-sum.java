class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currsum = 0;
        int low = 0;
        int high = 0;
        int minlengthwindow = Integer.MAX_VALUE;
        for(high = 0;high<nums.length;high++){
            currsum +=nums[high];
            while(currsum>=target){
                int currentwind = high - low + 1;
                minlengthwindow = Math.min(minlengthwindow,currentwind);
                currsum = currsum - nums[low];
                low++;
            } 
        }
        return minlengthwindow == Integer.MAX_VALUE?0: minlengthwindow;
    }
}