class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> nums2=new HashSet<>();
        for(int num:nums){
            nums2.add(num);
        }
        int longest=0;
        for(int num:nums2){
            if(!nums2.contains(num-1)){
            int length=1;
                while(nums2.contains(num+length)){
                    length++;
                    //i++;
                }
                if(length>longest)
                longest=length;
            }
        }
        return longest;
    }
}
