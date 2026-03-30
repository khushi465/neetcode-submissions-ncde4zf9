class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=1;i<nums.length;i++){
        //     for(int j=0;j<i;j++){
        //         // i can never be =j
        //         if(nums[j]+nums[i]==target){
        //             int arr[]={j,i};
        //             return arr;
        //         }
        //     }
        // }
        // return null;
        HashMap<Integer, Integer> hash=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(hash.containsKey(diff)&&hash.get(diff)!=i){
                return new int[]{i,hash.get(diff)};
            }
        }
    return new int[0];
    }
}
