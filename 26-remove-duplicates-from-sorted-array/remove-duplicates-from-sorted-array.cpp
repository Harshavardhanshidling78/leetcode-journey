class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size(),i,j=0;
        sort(nums.begin(),nums.end());
        for(i=1;i<n;i++)
        {
            if(nums[i] != nums[j])
                j++;
            nums[j] = nums[i];
        }
        return j+1;
    }
};