package leetcode;


/*
 * Given 2d grid map of 1 and 0 assuming 1 is land and the 0 is water
 * only horizontle and verticle is allowed
 *
 *
 * */
public class NumberOfIslands {
    public static void main(String[] args) {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
    

}
    public int numIslands(char[][] grid)
    {
      if(grid == null || grid.length==0)
    
        return 0;
    
    int numIslands = 0;
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[i].length;j++)
        {
            if(grid[i][j] == '1')
            {
               numIslands =   numIslands+dfs(grid,i,j);  
            }
        } 
    }
    return numIslands;
    }

    private int dfs(char[][] grid, int i, int j) 
    {
     if(i<0  //upwards bound
        ||j<0 //left
        || i>=grid.length//downwards
        || j>=grid[i].length   //right
        || grid[i][j]==0)
        {
           return 0;     
        }
       grid[i][j] ='0';//so that it is not counted again
       dfs(grid,i+1,j); //down
       dfs(grid,i-1,j);//up
       dfs(grid,i,j+1);//right
       dfs(grid,i,j-1);//left
       
        return 1;//base case to count the islands
    }
}
