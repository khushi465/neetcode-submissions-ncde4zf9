class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int orderIndex[]=new int[26];
        for(int i=0;i<order.length();i++){
            orderIndex[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<words.length-1;i++){
            String word1=words[i], word2=words[i+1]; 
        for(int j=0;j<word1.length();j++){
            if(j==word2.length()){
                return false;
            }
            if(word1.charAt(j)!=word2.charAt(j)){
                // if(orderIndex[word1.charAt(j)-'a']>orderIndex[word2.charAt(j)-'a']){
                if(order.indexOf(word1.charAt(j))>order.indexOf(word2.charAt(j))){
                    return false;
                }
                break;
            }
        }
        }
        return true;
    }
}