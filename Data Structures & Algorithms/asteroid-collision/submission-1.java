class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        // stack.add(asteroids[0]);
        for(int a:asteroids){
            int k=1;
            while(!stack.isEmpty()&&a<0&&stack.peek()>0){
                int diff=a+stack.peek();
                if(diff<0){
                    stack.pop();
                }else if(diff>0){
                    a=0;
                }else{
                    stack.pop();
                    a=0;
                }
            }if(a!=0){
            stack.add(a);
            }
        }
        int j=0, arr[]=new int[stack.size()];
        for(int it:stack){
            arr[j++]=it;
        }
        return arr;
    }
}