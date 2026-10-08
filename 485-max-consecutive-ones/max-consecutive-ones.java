class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxones=0;
        int count=0;
        for(int num:nums){
            if(num==1){
                count++;
                maxones=Math.max(maxones,count);
            }
            else
                count=0;
        }
        return maxones;
    }
}