class Solution {
    public int subsetXORSum(int[] nums) {
        return subset(0, nums, 0);
    }
    public int subset(int total, int nums[], int i){
        if(i==nums.length){
            return total;
        }
        return subset(total^nums[i], nums, i+1)+subset(total, nums, i+1);
    }
}