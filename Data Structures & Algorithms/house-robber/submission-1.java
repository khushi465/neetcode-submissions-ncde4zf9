class Solution {
    public int rob(int[] nums) {
        // two decisions either rob nums[i] and find maxrob of nums[i+2:n] or not rob nums[i] and find maxrob of nums[i+1:n]
        int rob1=0, rob2=0;
        for(int n:nums){
            // [rob1, rob2, n, n+1, ..]
            int temp=Math.max(n+rob1, rob2);
            rob1=rob2;
            rob2=temp;
        }
        return rob2;
    }
}
