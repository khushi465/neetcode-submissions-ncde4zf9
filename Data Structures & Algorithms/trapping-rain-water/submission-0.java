class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int area=0;
        int l=0, r=n-1, leftMax=height[l], rightMax=height[r];
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax, height[l]);
                area+=leftMax-height[l];
            }else{
                r--;
                rightMax=Math.max(rightMax, height[r]);
                area+=rightMax-height[r];
            }
        }
        return area;
    }
}
