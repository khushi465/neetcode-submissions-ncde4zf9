class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[]=new int[nums.length-k+1];
        int n=0;
        for(int i=0;i<nums.length-k+1;i++){
            int j=i;
            int max=Integer.MIN_VALUE;
            while(j<i+k){
                max=Math.max(max, nums[j]);
                j++;
            }
            arr[n++]=max;
        }
        return arr;
    }
}
