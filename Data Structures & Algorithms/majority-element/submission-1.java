class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> hash=new HashMap<>();
        for(int num:nums){
            hash.put(num, hash.getOrDefault(num, 0)+1);
            if(hash.get(num)>(n/2)){
                return num;
            }
        }
        return 0;
    }
}