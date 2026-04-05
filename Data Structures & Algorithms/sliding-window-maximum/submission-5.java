class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int arr[]=new int[nums.length-k+1];
        // int n=0, max=Integer.MIN_VALUE;
        // for(int i=0;i<k;i++){
        //     max=Math.max(max, nums[i]);
        // }
        // arr[n++]=max;
        // int l=1, r=k;
        // while(r<nums.length){
        //     //for the l=1 to r+1
        //     if(nums[r]>=max){
        //         max=nums[r];
        //     }else{
        //         if(max==nums[l-1]){
        //     max=Integer.MIN_VALUE;
        //             for(int i=l;i<=r;i++){
        //         max=Math.max(max, nums[i]);
        //         }
        //         }
        //     }
        //     l++;
        //     r++;
        //     arr[n++]=max;
        // }
        // return arr;
    //     PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)->b[0]-a[0]);
    //     int[] output=new int[nums.length-k+1];
    //     int idx=0;
    //     for(int i=0;i<nums.length;i++){
    //         heap.offer(new int[]{nums[i],i});
    //         if(i>=k-1){
    //             while(heap.peek()[1]<=i-k){
    //                 heap.poll();
    //             }
    //         output[idx++]=heap.peek()[0];
    //         }
    //     }
    // return output;
    int n=nums.length;
    int[] output=new int[nums.length-k+1];
    Deque<Integer> q=new LinkedList<>();
    int l=0, r=0;
    // stores the index of the value added
    //logic is whenever a value larger than the current rightmost is added we remove the current value
    while(r<n){
        while(!q.isEmpty()&&nums[q.getLast()]<nums[r]){
            q.removeLast();
        }
        q.addLast(r);//we add it whether it is smaller or not
        // the first value is outside the window
        if(l>q.getFirst()){
            q.removeFirst();
        }
        // we have to check whether the window is atleast equal to k
        if((r+1)>=k){
            output[l]=nums[q.getFirst()];//gives the leftmost value
            l++;
        }
        r++;
    }
    return output;
    }
}
