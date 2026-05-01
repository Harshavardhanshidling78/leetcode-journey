class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" +");
        int j = word.length-1;
        StringBuilder sb = new StringBuilder();
        while(j>=0){
            sb.append(word[j]);
            sb.append(" ");
            j--;
        }
        return sb.toString().trim();
    }
}