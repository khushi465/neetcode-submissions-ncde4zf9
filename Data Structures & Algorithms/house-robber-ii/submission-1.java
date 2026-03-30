class Solution {
    public int helper(int[] nums, int l, int r) {
        // two decisions either rob nums[i] and find maxrob of nums[i+2:n] or not rob nums[i] and find maxrob of nums[i+1:n]
        int rob1=0, rob2=0;
        for(int i=l;i<r;i++){
            int n=nums[i];
            // [rob1, rob2, n, n+1, ..]
            int temp=Math.max(n+rob1, rob2);
            rob1=rob2;
            rob2=temp;
        }
        return rob2;
    }
    public int rob(int[] nums){
        int n=nums.length;
        return Math.max(nums[0],Math.max(helper(nums,1,n),helper(nums,0,n-1)));
    // nums[0] is added in case of edge case of 1 element
    }
}
// in the circular you have to make sure you are not using both first and last at the same time
// so we call the function once for everything except first and then again for everything except last and return the max 
// max(rob(nums[1:n], rob(nums[0:n-1])))