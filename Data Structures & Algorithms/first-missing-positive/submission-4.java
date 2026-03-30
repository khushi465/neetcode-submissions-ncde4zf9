class Solution {
    public int firstMissingPositive(int[] nums) {
// hashmap in the array
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=0;
            }
        }
        int n=nums.length;
        // if the number i is present then set the i-1th index as negative, if i-1th is 0 then set it to -(i+1)
        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            if(val>=1&&val<=n){
                if(nums[val-1]==0){
                    nums[val-1]=-1*(n+1);
                }else if(nums[val-1]>0){
                    nums[val-1]*=-1;
                }
            }
        }
        for(int i=1;i<=n;i++){
            if(nums[i-1]>=0){
                return i;
            }
        }
        return n+1;
    }
}