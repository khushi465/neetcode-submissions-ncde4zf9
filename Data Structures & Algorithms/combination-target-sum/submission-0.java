class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        combinations(nums, list, 0, new ArrayList<>(), target, 0);
        return list;
    }
    public void combinations(int[] nums, List<List<Integer>> list, int sum, List<Integer> arr, int target, int i){
        if(i>=nums.length){
            return;
        }
        if(target==sum){
            list.add(new ArrayList<>(arr));
            return;
        }else if(target<sum){
            return;
        }
        arr.add(nums[i]);
        combinations(nums, list, sum+nums[i], arr, target, i);
        arr.remove(arr.size()-1);
        combinations(nums, list, sum, arr, target, i+1);
    }
}
