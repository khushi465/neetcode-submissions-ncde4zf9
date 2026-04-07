class MinStack {
    //minheap
    PriorityQueue<Integer> minHeap;
    LinkedList<Integer> numbers;
    public MinStack() {
        numbers=new LinkedList<>();
        minHeap=new PriorityQueue<>();
    }
    
    public void push(int val) {
        numbers.push(val);
        if(minHeap.isEmpty()||val<=minHeap.peek())
        minHeap.offer(val);
    }
    
    public void pop() {
        if(numbers.isEmpty()) return;
        int n=numbers.pop();
        if(minHeap.peek()==n){
            minHeap.poll();
        }
    }
    
    public int top() {
        return numbers.peek();
    }
    
    public int getMin() {
        return minHeap.peek();
    }
}
