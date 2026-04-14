class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int h:hand){
            map.put(h, map.getOrDefault(h, 0)+1);
        }
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(map.keySet());
        while(!minHeap.isEmpty()){
            int k=minHeap.peek();
            for(int i=k;i<k+groupSize;i++){
                if(!map.containsKey(i)){
                    return false;
                }
                map.put(i, map.get(i)-1);
                if(map.get(i)==0){
                    if(i!=minHeap.peek()){
                        return false;
                    }
                    minHeap.poll();
                }
            }
        }
        return true;
    }
}
