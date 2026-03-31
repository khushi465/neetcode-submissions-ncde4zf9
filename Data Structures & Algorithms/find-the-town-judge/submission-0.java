class Solution {
    public int findJudge(int n, int[][] trust) {
        // number of incoming edges should be n-1 and outgoing be 0
        int output=-1;
        HashMap<Integer,Integer> incoming=new HashMap<>();
        HashMap<Integer,Integer> outgoing=new HashMap<>();
        for(int i=1;i<=n;i++){
            incoming.put(i,0);
            outgoing.put(i,0);
        }
        for(int i=0;i<trust.length;i++){
            outgoing.put(trust[i][0],outgoing.get(trust[i][0])+1);
            incoming.put(trust[i][1],incoming.get(trust[i][1])+1);
        }
        for(Map.Entry<Integer, Integer> e:outgoing.entrySet()){
            if(e.getValue()==0){
                if(incoming.get(e.getKey())==n-1){
                    output=e.getKey();
                }
            }
        }
            

        // }
        return output;
    }
}