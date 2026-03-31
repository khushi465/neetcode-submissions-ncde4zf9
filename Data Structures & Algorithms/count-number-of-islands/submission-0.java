class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length, n=grid[0].length;
        int islands=0;
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i, j);
                    islands++;
                }
            }
         }
         return islands;
    }
    private void dfs(char grid[][], int i, int j){
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        for(int[] dir:directions){
            dfs(grid, i+dir[0], j+dir[1]);
        }
    }
}
