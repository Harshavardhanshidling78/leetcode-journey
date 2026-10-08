class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []num = new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++) {
            num[j++]=nums[i];
            num[j++]=nums[i+n];
        }
        return num;
    }
}