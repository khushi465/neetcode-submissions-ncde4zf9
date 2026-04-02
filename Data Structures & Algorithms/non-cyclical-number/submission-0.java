class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
       while(true){
        if(set.contains(sumOfSquares(n))){
            return false;
        }
        if(sumOfSquares(n)==1){
            return true;
        }
        set.add(sumOfSquares(n));
        n=sumOfSquares(n);
       }
    }
    public int sumOfSquares(int temp){
        int sum=0;
        while(temp>0){
            sum+=Math.pow(temp%10,2);
            temp/=10;
        }
        return sum;
    }
}
