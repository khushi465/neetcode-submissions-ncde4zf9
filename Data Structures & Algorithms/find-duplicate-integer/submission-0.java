class Solution {
    public int findDuplicate(int[] nums) {
        int arr[]=new int[nums.length+1];
        for(int el: nums){
            arr[el]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(arr[i]>1){
                return i;
            }
        }
        return -1;
    }
}
