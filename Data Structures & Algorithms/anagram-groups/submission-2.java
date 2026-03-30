class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> list=new HashMap<>();
        for(String s:strs){
           int[] arr=new int[26];
           for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']++;
           }
           String key=Arrays.toString(arr);
           list.putIfAbsent(key,new ArrayList<>());
            list.get(key).add(s);
        }
        return new ArrayList<>(list.values());
    }
}
