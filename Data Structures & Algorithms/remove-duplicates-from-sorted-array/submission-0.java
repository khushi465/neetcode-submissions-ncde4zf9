class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            int currNum=nums[i];
            while(i<nums.length-1&&nums[i+1]==currNum){
                i++;
            }
            System.out.println(currNum);
            nums[j++]=currNum;
            k++;
        }
        return k;
    }
}