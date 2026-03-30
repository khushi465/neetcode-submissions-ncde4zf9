class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        combinations(list, 0, new ArrayList<>(), n , k , 1);
        return list;
    }
    public void combinations(List<List<Integer>> list,int numbers,  List<Integer> arr, int n, int k, int i){
        if(numbers==k){
             list.add(new ArrayList<>(arr));
            return;
        }
        if(i==n+1){
            return;
        }
        arr.add(i);
        combinations(list, numbers+1, arr, n, k, i+1);
        arr.remove(arr.size()-1);
        combinations(list, numbers, arr, n,k,i+1);
    }
}