class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }           
            if(nums[l]>nums[mid]){
                //right side
                if((target<nums[mid])||(nums[r]<target)){//target less than mid
                    //left part of right side
                    r=mid-1;
                }else{//target greater than mid either right of right or entire left
                    // if{
                        //left portion- 
                        // r=mid-1;
                    // }else{
                        l=mid+1;
                    // }
                }
            }               
            else{
                //left side
                if((target>nums[mid])||(nums[l]>target)){
                    //right part of left side
                    l=mid+1;
                }else{//target is less than mid. either left of left or entire right
                    // if{
                        //right part
                        // l=mid+1;
                    // }else{
                        //left of left
                        r=mid-1;
                    }
                }
            
        }
        return -1;
    }
}
