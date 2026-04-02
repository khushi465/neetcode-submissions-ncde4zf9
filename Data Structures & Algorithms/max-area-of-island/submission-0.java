class Solution {
    public static int directions[][]={{1,0},{-1,0},{0,-1},{0,1}};
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        System.out.println(grid.length);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int area=dfs(grid, i,j);
                     System.out.println(i+" "+j+" "+area);
                    maxArea=Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid, int i, int j){
        if(i>=grid.length||j>=grid[0].length||i<0||j<0||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
       int area=1;
        for(int[] dir:directions){
           area+= dfs(grid,  i+dir[0], j+dir[1]);
        }
        // System.out.println(i+" "+j+" "+area);
        return area;
    }
}
