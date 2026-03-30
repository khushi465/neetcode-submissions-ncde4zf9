class Solution {
    public String mergeAlternately(String word1, String word2) {
        int shortest=Math.min(word1.length(), word2.length());
        int i=0;
        String merged="";
        while(i<shortest){
            merged+=word1.charAt(i)+""+word2.charAt(i);
            i++;
        }
        if(shortest==word1.length()){
            while(i<word2.length()){
                merged+=word2.charAt(i);
                i++;
            }
        }else{
            while(i<word1.length()){
                merged+=word1.charAt(i);
                i++;
            }
        }
        return merged;
    }
}