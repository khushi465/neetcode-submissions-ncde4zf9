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
        hash.add(nums[i]);
    }
    if(hash.size()==nums.length){
        return false;
    }else{
        return true;
    }
    }
}