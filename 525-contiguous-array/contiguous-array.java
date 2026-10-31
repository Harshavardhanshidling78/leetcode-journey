class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] first = new int[2 * n + 1];

        for (int i = 0; i < first.length; i++) {
            first[i] = -2;
        }

        int sum = n;
        int maxLength = 0;
        first[sum] = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }

            if (first[sum] != -2) {
                maxLength = Math.max(maxLength, i - first[sum]);
            } else {
                first[sum] = i;
            }
        }

        return maxLength;
    }
}