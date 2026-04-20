class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) 
            return n;

        int i = 2, j = 2;

        while (i < n) {
            if (nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
            i++;
        }
        return j;
    }
}