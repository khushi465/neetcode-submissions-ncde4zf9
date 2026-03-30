class Solution {
    public boolean find(int[] nums, int n){
        for(int num:nums){
            if(num==n){
                return true;
            }
        }
        return false;
    }
    public int firstMissingPositive(int[] nums) {

        int j=1;
        while(true){
            if(!find(nums, j)){
                return j;
            }
            j++;
        }
    }
}