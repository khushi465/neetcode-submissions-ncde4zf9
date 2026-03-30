class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int s1char[]=new int[26];
        int s2char[]=new int [26];
        int l=0, r=s1.length()-1;
        for(int i=0;i<s1.length();i++){
            s1char[s1.charAt(i)-'a']++;
        }
            //         for(int i=0;i<26;i++){
            //    System.out.print(s1char[i]+" ");
            // }
        while(r<s2.length()){
            for(int i=l;i<=r;i++){
                s2char[s2.charAt(i)-'a']++;
            }
            // System.out.println("\n"+l+" "+r);
            // for(int i=0;i<26;i++){
            //    System.out.print(s2char[i]+" ");
            // }
            if(Arrays.equals(s1char, s2char)){
                return true;
            }
            else{
            l++;
            r++;
            s2char=new int[26];
            }
        }
return false;
            }
        }
