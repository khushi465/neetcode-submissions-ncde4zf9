class Solution {
    public int subsetXORSum(int[] nums) {
        // return subset(0, nums, 0);
        int res=0;
        for(int num:nums){
            res=res|num;
        }
        return res*(int)Math.pow(2, nums.length-1);//res<<nums.length-1
    }
    public int subset(int total, int nums[], int i){
        if(i==nums.length){
            return total;
        }
        // if we take nums[i] and if we dont
        return subset(total^nums[i], nums, i+1)+subset(total, nums, i+1);
    }
}