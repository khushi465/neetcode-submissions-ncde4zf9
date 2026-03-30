class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int n=nums.length;
        ArrayList<Integer> arr= new ArrayList<>();
        for(Map.Entry<Integer, Integer> en:map.entrySet()){
           if( en.getValue()>(n/3)){
                arr.add(en.getKey());
           }
        }
        return arr;
    }
}