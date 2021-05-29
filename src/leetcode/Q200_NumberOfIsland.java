package leetcode;

/*
* Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

* Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
*
* Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
* */

public class Q200_NumberOfIsland {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int answer = 0;
        for(int row = 0; row < r; row++){
            for(int col = 0; col < c; col++){
                if(grid[row][col] == '1'){
                    spreadRecur(grid, row, col);
                    answer++;
                }
            }
        }
        return answer;
    }

    private void spreadRecur(char[][] grid, int row, int col){
        if(validation(grid, row, col) && grid[row][col] == '1'){
            grid[row][col] = '0';
            spreadRecur(grid, row-1, col);
            spreadRecur(grid, row+1, col);
            spreadRecur(grid, row, col-1);
            spreadRecur(grid, row, col+1);
        }
    }

    private boolean validation(char[][] grid, int row, int col){
        if((row >= 0 && row < grid.length) && (col >= 0 && col < grid[0].length)){
            return true;
        }else{
            return false;
        }
    }
}
/*
* idea :
* 각 칸이 '1'이면 0으로 마킹하면서 인접한 네칸에 대해서 spreadRecur 수행
* time : O(MN) (row * col 모든 원소에 대해 한번씩은 다 check하는 과정이 있으므로)
* */