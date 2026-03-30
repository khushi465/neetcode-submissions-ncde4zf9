class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> hash=new HashMap<>();
        for(int num:nums){
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e: hash.entrySet()){
            if(e.getValue()>(n/2)){
                return e.getKey();
            }
        }
        return 0;
    }
}