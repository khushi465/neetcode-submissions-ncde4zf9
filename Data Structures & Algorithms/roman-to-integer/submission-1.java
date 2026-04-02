class Solution {
    public int romanToInt(String s) {
        int sum=0;
        HashMap<Character, Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length();i++){
        //     if(c=='I'){
        //         if(i+1<s.length()&&(s.charAt(i+1)=='X'||s.charAt(i+1)=='V')){
        //             sum+=-1;
        //         }else{
        //             sum+=1;
        //         }
        //     }
        //    else if(c=='V'){
        //         sum+=5;
        //     }
        //     else if(c=='X'){
        //         if(i+1<s.length()&&(s.charAt(i+1)=='C'||s.charAt(i+1)=='L')){
        //             sum+=-10;
        //         }else{
        //             sum+=10;
        //         }
        //     }
        //     else if(c=='L'){
        //         sum+=50;
        //     }
        //     else if(c=='C'){
        //         if(i+1<s.length()&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
        //             sum+=-100;
        //         }else{
        //             sum+=100;
        //         }
        //     }
        //     else if(c=='D'){
        //         sum+=500;
        //     }
        //     else if(c=='M'){
        //         sum+=1000;
        //     }
        if(i+1<s.length()&&map.get(s.charAt(i))<map.get(s.charAt(i+1))){
            sum-=map.get(s.charAt(i));
        }else{
            sum+=map.get(s.charAt(i));
        }
        }
        return sum;
    }
}