class Solution {
    public int[] plusOne(int[] digits) {

        int carry=1;
            int i=digits.length-1;
            while(i>=0&&carry!=0){
                carry=(digits[i]+1)/10;
                digits[i]=(digits[i]+1)%10;
                i--;
            }
            if(carry==1){
                int[] result=new int[digits.length+1];
                result[0]=1;
                System.arraycopy(digits, 0, result, 1, digits.length);
                return result;
            }
        return digits;
        }
}
