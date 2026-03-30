class Solution {
    public int removeElement(int[] nums, int val) {
        // int arr[]=new int[nums.length];
        // int j=0;
        // for(int num:nums){
        //     if(num!=val){
        //         arr[j++]=num;
        //     }
        // }
        // for(int i=0;i<j;i++){
        //     nums[i]=arr[i];
        // }
        // return j;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}