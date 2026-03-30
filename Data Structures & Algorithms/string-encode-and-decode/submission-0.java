class Solution {

    public String encode(List<String> strs) {
        String res="";
        if(strs.size()==0){
            return "";
        }
        for(String s:strs){
            res+=s.length()+"#"+s;

        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> strings=new ArrayList<>();
        if(str.equals("")){
            return strings;
        }
            String num="";
            String word="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='#'){
                int num1=Integer.parseInt(num);
                num="";
                while(num1!=0){
                    i++;
                    word+=str.charAt(i);
                    num1--;
                }
                strings.add(word);
                word="";
            }
            else{
                  num+=c;
            }  
        }
        return strings;
    }
}
