class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //min h= len(piles)
        //we have to try every soln from 1 to max value in piles to get the solution
        int max=0;
        for(int p:piles){
        max=Math.max(p,max);
        }
        int l=1, r=max,rem=max;
        while(l<=r){
            int mid=(l+r)/2;
            int hours=0;
            for(int p:piles){
                hours+=Math.ceil((double)p/mid);
            }
            if(hours<=h){
                r=mid-1;
                rem=Math.min(rem, mid);
            }else{
                l=mid+1;
            }
        }
        return rem;
    }
}
