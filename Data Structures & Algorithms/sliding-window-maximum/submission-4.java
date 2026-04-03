class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[]=new int[nums.length-k+1];
        // int n=0;
        // for(int i=0;i<nums.length-k+1;i++){
        //     int j=i;
        //     int max=Integer.MIN_VALUE;
        //     while(j<i+k){
        //         max=Math.max(max, nums[j]);
        //         j++;
        //     }
        //     arr[n++]=max;
        // }
        // return arr;
        int n=0, max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            max=Math.max(max, nums[i]);
        }
        arr[n++]=max;
        int l=1, r=k;
        while(r<nums.length){
            //for the l=1 to r+1
            if(nums[r]>=max){
                max=nums[r];
            }else{
                if(max==nums[l-1]){
            max=Integer.MIN_VALUE;
                    for(int i=l;i<=r;i++){
                max=Math.max(max, nums[i]);
                }
                }else{

                }
            }
            l++;
            r++;
            arr[n++]=max;
        }
        return arr;
    }
}
