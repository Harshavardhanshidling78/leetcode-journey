class Solution {
    public int hIndex(int[] citations) {
        int n =citations.length;
        int i,maxCitation = 0;
        // Arrays.sort(citations);
        // for(i=0;i<n;i++){
        //     maxCitation = n - i;
        //     if(citations[i] >= maxCitation){
        //         return maxCitation;
        //     }
        // }
        int count[] = new int[n + 1];
        for (int c : citations) {
            if (c >= n) {
                count[n]++;
            } else {
                count[c]++;
            }
        }

        for (i = n; i >= 0; i--) {
            maxCitation += count[i];
            if (maxCitation >= i) {
                return i;
            }   
        }
        return 0;
    }
}