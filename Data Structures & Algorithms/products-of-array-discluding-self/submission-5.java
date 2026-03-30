class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int product=1;
        // int arr[]=new int[nums.length];
        // int pref[]=new int[nums.length];
        // int post[]=new int[nums.length];
        // pref[0]=post[nums.length-1]=1;
        // for(int i=1;i<nums.length;i++){
        //     pref[i]=pref[i-1]*nums[i-1];
        // }
        // for(int i=nums.length-2;i>=0;i--){
        //     post[i]=post[i+1]*nums[i+1];
        // }
        // for(int i=0;i<nums.length;i++){
        //     arr[i]=post[i]*pref[i];
        // }
        // return arr;

        int zerocount=0;
        int prod=1;
        for(int num:nums){
            if(num==0){
                zerocount++;
            }else{
                prod*=num;
            }
        }

        int arr[]=new int[nums.length];
        if(zerocount>1){
            return new int[nums.length];
            // return arr;
        }
        for(int i=0;i<nums.length;i++){
            if(zerocount>0){
                arr[i]=(nums[i]==0)?prod:0;
            }else{
                arr[i]=prod/nums[i];
            }
        }
        return arr;
    }
}  
