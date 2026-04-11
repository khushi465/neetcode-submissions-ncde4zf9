class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1, mid=0,min=10000;
        while(l<=r){
            if(nums[l]<=nums[r]){
                min=Math.min(nums[l],min);
                break;
            }
            mid=(l+r)/2;
            min=Math.min(nums[mid],min);
            if(nums[mid]>=nums[l]){
                l=mid+1;
            }else {
               r=mid-1;
            }
        }
        return min;
    }
}
