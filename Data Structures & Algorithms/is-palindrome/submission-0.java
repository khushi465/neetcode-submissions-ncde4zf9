class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')){
            s1+=s.charAt(i);
            }
        }
        int k=0;
        for(int i=0;i<s1.length()/2;i++){
            if(!(s1.charAt(i)==s1.charAt(s1.length()-1-i))){
                k=1;
                break;
            }
        }
        if(k==0){
            return true;
        }
        // System.out.println(s1);
        return false;
    }
}
