package Graphs;
import java.util.*;

public class islands {
    
    public static class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int vis[][] = new int[n][m];
        
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(grid[row][col]=='1' && vis[row][col]==0){
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return count;
    }

    private static void bfs(int row, int col, int[][] vis, char[][] grid){
        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row, col));

        while(!q.isEmpty()){
            int r = q.peek().x;
            int c = q.peek().y;
            q.poll();
            for(int i=-1; i<=1; i++){
                for(int j=-1; j<=1; j++){
                    if(isValid(r+i, c+j, vis, grid)){
                        vis[r+i][c+j] = 1;
                        q.add(new Pair(r+i, c+j));
                    }
                }
            }
        }
    }

    private static boolean isValid(int x, int y, int[][] vis, char[][] grid) {
        return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && vis[x][y] == 0 && grid[x][y] == '1';
    }

}
