class Solution {
    public int jump(int[] nums) {
        int n = nums.length-1;
        int totalJump = 0;
        int covered = 0;
        int lastJump = 0;

        if(n == 0)
            return 0;
        
        for(int i=0;i<n;i++){
            if(covered < i+nums[i])
                covered = i+nums[i];
            if(i == lastJump){
                lastJump = covered;
                totalJump++;

                if(covered >= n)
                    return totalJump;
            }
        }
        return totalJump;
    }
}