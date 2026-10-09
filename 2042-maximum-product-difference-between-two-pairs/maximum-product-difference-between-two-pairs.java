class Solution {
    public int maxProductDifference(int[] nums) {
        int maxno1=Integer.MIN_VALUE;
        int maxno2=Integer.MIN_VALUE;
        int minno1=Integer.MAX_VALUE;
        int minno2=Integer.MAX_VALUE;

        for(int num:nums){
            if(num>maxno1){
                maxno2=maxno1;
                maxno1=num;
            }else if(num>maxno2){
                maxno2=num;
            }

            if(num<minno1){
                minno2=minno1;
                minno1=num;
            }else if(num<minno2){
                minno2=num;
            }
        }
        return ((maxno1*maxno2)-(minno1*minno2));
    }
}