class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            // System.out.println(s);
            if(s.matches("-?\\d+")){
                stack.push(Integer.parseInt(s));
            }else{
                int first=stack.pop();
                // System.out.println(first);
                int second=stack.pop();
                // System.out.println(second); 
                switch(s){
                    case "+":
                    stack.push(first+second);
                    break;
                    case "-":
                    stack.push(second-first);
                    break;
                    case "*":
                    stack.push(first*second);
                    break;
                    case "/":
                    stack.push(second/first);
                    break;
                }
            }
        }
        return stack.pop();
    }
}
