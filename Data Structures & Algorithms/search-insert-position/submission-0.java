class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1,found=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(target==nums[mid]){
                found=1;
                return mid;
            }
            if(target<nums[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;

    }
}