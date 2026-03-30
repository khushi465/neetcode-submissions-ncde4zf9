class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int j=1;
            while(j<=k&&i+j<nums.length){
                if(nums[i+j]==nums[i]){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}