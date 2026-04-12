class Solution {
    public int mySqrt(int x) {
        int l=0, r=x,max=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid>x){
                r=mid-1;
            }else if((long)mid*mid==x){
                return mid;
            }else{
                max=Math.max(mid, max);
                l=mid+1;
            }
        }
        return max;
    }
}