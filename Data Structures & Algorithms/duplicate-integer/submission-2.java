class Solution {
    public boolean hasDuplicate(int[] nums) {
    //     for(int i=1;i<nums.length;i++){
    //         for(int j=0;j<i;j++){
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    // return false;
    HashSet<Integer> hash=new HashSet<Integer>();
    for(int i=0;i<nums.length;i++){
        if(hash.contains(nums[i])){
            return true;
        }
        hash.add(nums[i]);
    }
    return false;
    }
}