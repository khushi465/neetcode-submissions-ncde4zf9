class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortest=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<shortest)
            shortest=strs[i].length();
        }
        String prefix="";
        for(int i=0;i<shortest;i++){
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    return prefix;
                }
            }
        prefix+=ch;
        }
        return prefix;
    }
}