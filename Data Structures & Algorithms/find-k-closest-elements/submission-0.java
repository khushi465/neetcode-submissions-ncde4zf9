class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0,r=arr.length-k;//not including the last
        List<Integer> list=new ArrayList<>();
        while(l<r){
            int m=(l+r)/2;
            System.out.println(m+" "+l+" "+r+" "+(x-arr[m])+" "+(arr[m+k]-x));
            if(Math.abs(x-arr[m])>Math.abs(arr[m+k]-x)){
                l=m+1;
            }else{
                r=m;
            }
        }
        for(int i=l;i<l+k;i++){
            list.add(arr[i]);
        }
     
        return list;
    }
}