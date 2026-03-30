class Solution {
    public int maxArea(int[] heights) {
        int width=1;
        // width*distance between them * lowest height among them
        int n=heights.length;
        int p1=0, p2=n-1;
        // System.out.println(heights.length);
        int area=0, maxArea=0, count=0;
        while(p1<p2){
            area=(p2-p1)*Math.min(heights[p1],heights[p2]);
            System.out.println(area);
            maxArea=Math.max(area, maxArea);
            if(heights[p1]<=heights[p2]){
                p1++;
            }else{
                p2--;
            }
        }
       return maxArea;
    }
}
