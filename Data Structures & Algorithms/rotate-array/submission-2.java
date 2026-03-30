class Solution {
    public void rotate(int[] nums, int k) {
            // int temp=nums[nums.length-1];
            int n=nums.length;
            // 1 2 3 4 5 6 7 8
            int count=0;
            for(int start=0;count<n;start++){
                int current=start;
                int prev=nums[start];
                do{
                    int nextIdx=(current+k)%n;
                    int temp=nums[nextIdx];
                    nums[nextIdx]=prev;
                    prev=temp;
                    current=nextIdx;
                    count++;
                }while(start!=current);
            }
    }
    }

    // reverse 0 to n-1 then 0 to k-1 then k to n-1