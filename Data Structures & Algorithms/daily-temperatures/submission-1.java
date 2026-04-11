class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[]=new int[temperatures.length];
        // for(int i=0;i<temperatures.length;i++){
        //     System.out.println(arr[i]);
        // }
        // for(int i=0;i<temperatures.length-1;i++){
        //     int j=i+1;
        //     while(j<temperatures.length){
        //         if(temperatures[i]<temperatures[j]){
        //             arr[i]=j-i;
        //             break;
        //         }
        //         j++;
        //     }
        // }
        // return arr;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int popped=stack.pop();
                arr[popped]=i-popped;
            }
            stack.push(i);
        }
        return arr;
    }
}
