class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int n = nums.length;
        int i=0,majEle = 0;
        while(i<n){
            if(count == 0){
                majEle = nums[i];
            }
            if(nums[i] == majEle){
                count++;
            }else{
                count--;
            }
            i++;
        }
        return majEle;
    }
}