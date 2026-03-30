class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuilder merged=new StringBuilder();
        for(int i=0;i<n||i<m;i++){
            if(i<n){
                merged.append(word1.charAt(i));
            }
            if(i<m){
                merged.append(word2.charAt(i));
            }
        }
        return merged.toString();
    }
}