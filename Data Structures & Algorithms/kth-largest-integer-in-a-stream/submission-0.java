class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.minHeap=new PriorityQueue<>();
        for(int num:nums){
            minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        return minHeap.peek();
    }
}
// we use min heap because we need to add elements not remove 
// and we care only about the kth largest element onwards so size should be k
// min function is O(1) and add/pop is O(log n)
// in brute force we need to sort each time we add O(n)
// the problem doesnt require unique elements that is 3,[1,2,2,3] me i=1 vala 2 is the kth largest not 1