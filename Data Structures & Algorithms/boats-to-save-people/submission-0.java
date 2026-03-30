class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
        int n1=0, n2=people.length-1;
            while(n1<n2){
                  if(people[n1]+people[n2]>limit){
                    n2--;
                    boats++;
                  }else{
                    boats++;
                    n1++;
                    n2--;
                  }
            }
            if(n1==n2){
                boats++;
            }
            return boats;
        }
    }
