class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        sum(candidates, list,  new ArrayList<>(), 0, target, 0);
        return list;
    }
    public void sum(int[] candidates, List<List<Integer>> list, List<Integer> arr, int i, int target, int total){
          if(target==total){
            list.add(new ArrayList<>(arr));
            return;
        }
        if(target<total||i>=candidates.length){
            return;
        }
      
        arr.add(candidates[i]);
        sum(candidates, list, arr, i+1, target, total+candidates[i]);
        arr.remove(arr.size()-1);
        while(i+1<candidates.length&&candidates[i]==candidates[i+1]){
            i++;
        }
        sum(candidates,list, arr, i+1, target, total);

    }
}
