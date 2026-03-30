class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top=stack.pop();
                int plus=top+stack.peek();
                stack.push(top);
                stack.push(plus);
                sum+=stack.peek();
            }
            else if(operations[i].equals("C")){
                sum-=stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
                sum+=stack.peek();
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
                sum+=stack.peek();
            }
        }
        
        return sum;
    }
}