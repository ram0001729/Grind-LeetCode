public class rat_maze {
public static  boolean issafe(int[][] maze,int row,int col,int n,int[][] vis){
    if(row<n && col<n && row>=0 && col >=0 && maze[row][col]==1 && vis[row][col]==0){
        return true;
     }
   
     return false;
    }
    

    public static void printmaze(int[][] vis, int n) {
    for (int i = 0; i<n; i++) {
        for (int j = 0; j<n; j++) {
            System.out.print(vis[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
}

public static  void mazesolve(int[][] maze,int row,int col,int n,String ans,int[][] vis){
    if(row==n-1 && col==n-1){
        vis[row][col]=1;
         printmaze(vis,n);
          return ;
    }

    if (maze[n-1][n-1] == 0) {
    System.out.println("No path possible");
    return;
}

    if(issafe(maze,row,col,n,vis)){
        vis[row][col]=1;
 mazesolve(maze, row + 1, col, n, ans + "D", vis);
mazesolve(maze, row, col - 1, n, ans + "L", vis);
mazesolve(maze, row, col + 1, n, ans + "R", vis);
mazesolve(maze, row - 1, col, n, ans + "U", vis);

     vis[row][col]=0;
    }
    //total=left+right+up+down;
         return;
}
public static void main(String[] args){
  int[][] maze = {
    {1, 0, 0, 0},
    {1, 1, 0, 1},
    {0, 1, 0, 0},
    {1, 1, 1, 1}
};
  int[][]  vis= {
    {0, 0, 0, 0},
    {0, 0, 0, 0},
    {0, 0, 0, 0},
    {0, 0, 0, 0}
};
    String ans ="";
    int n=4;
    int row=0,col=0;
    mazesolve(maze,row,col,n,ans,vis);
}

}
