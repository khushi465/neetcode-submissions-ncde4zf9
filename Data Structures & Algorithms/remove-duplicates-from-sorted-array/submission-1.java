class Solution {
    public int removeDuplicates(int[] nums) {
    //     int k=0,j=0;
    //     for(int i=0;i<nums.length;i++){
    //         int currNum=nums[i];
    //         while(i<nums.length-1&&nums[i+1]==currNum){
    //             i++;
    //         }
    //         System.out.println(currNum);
    //         nums[j++]=currNum;
    //         k++;
    //     }
    //     return k;
    // }
    int l=1;
    for(int r=1;r<nums.length;r++){
        if(nums[r]!=nums[r-1]){
            nums[l++]=nums[r];
        }
    }
    return l;
}
}