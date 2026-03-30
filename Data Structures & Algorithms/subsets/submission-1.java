class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        subs(nums, 0, new ArrayList<>(), list);
        return list;
    }
    public void subs(int[] nums, int i, List<Integer> arr, List<List<Integer>> list){
        if(i>=nums.length){
            list.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        subs(nums, i+1, arr, list);
        arr.remove(arr.size()-1);
        subs(nums, i+1, arr, list);
    }
}
