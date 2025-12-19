 public class number_in_matrix {

static boolean isSafe(int[][] grid,int row,int col,int n){
    if(row<n && col<n && row>=0 && col >=0 &&grid[row][col]!=10 ) {
        return true;
    }
   
 return  false;
}
static  void existsPath(int[][] grid, int row, int col, int i,String ans, int[] path,int n){
    if(i== path.length){
        System.out.println(" pathmoves  : " +ans);
        return;
    }
 if(!isSafe(grid,row,col,n)) return;

   int temp = grid[row][col];
   int next=i;
if(temp==path[i]){
    next=i+1;
}
  grid[row][col]=10;
 existsPath(grid, row + 1, col, next, ans + "D",path,n);
 existsPath( grid, row, col - 1, next, ans + "L",path,n);
 existsPath( grid, row, col + 1, next, ans + "R",path,n);
 existsPath( grid, row - 1, col, next, ans + "U",path,n);
grid[row][col]=temp;

}

public static void main(String[] args){
    int[][] grid = {
    {1, 0, 3, 4},
    {5, 6, 3, 2},
    {7, 8, 9, 1},
    {7, 6, 0, 0},
};
int row=0;
int col=0;
String ans="";
int i=0;
int n=grid.length;
int[] path = {3, 2, 1};
 existsPath(grid,row,col,i,ans,path,n);
}

}
