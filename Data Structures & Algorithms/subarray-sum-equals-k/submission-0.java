class Solution {
    public int subarraySum(int[] nums, int k) {
        int sumTotal=0, count=0;
        for(int num:nums){
            sumTotal+=num;
        }
        for(int i=0;i<nums.length;i++){
            int sum=sumTotal;
            int j=nums.length-1;
            while(j>=i){
                if(sum==k){
                    // System.out.println(i+" "+(j)+" "+sum);
                    count++;
                }
                sum-=nums[j];
                j--;
            }
            sumTotal-=nums[i];
        }
        return count;
    }
}