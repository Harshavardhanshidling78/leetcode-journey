class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        int i;
        int lastPosition = n;
        for(i=n-1;i>=0;i--){
            if(i+nums[i] >= lastPosition){
                lastPosition = i;
            }
        }
        if (lastPosition == 0)
            return true;
        return false;
    }
}