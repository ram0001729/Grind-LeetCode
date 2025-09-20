import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    boolean[][] matrix={
	        {true,true,false},
	        {true, true,false},
	        {true,true,true}
	    };
	   int[][] pathnum=new int[matrix.length][matrix[0].length];
       int value;
	   maze(matrix,"",0,0,1,pathnum);
	    
 	}
static void maze(boolean[][] matrix,String p,int row,int col,int value,int[][] pathnum){
 
     if(row==matrix.length -1&& col==matrix[0].length-1){
        pathnum[row][col]=value;

         for(int[] var:pathnum){
             System.out.println(Arrays.toString(var));
             }
             System.out.println();
         System.out.println(p);
          return ;
     }
     if(matrix[row][col]==false){
         return;
     }
      matrix[row][col]=false;
      pathnum[row][col]=value;

    if(col<matrix[0].length-1){
        maze(matrix,p+'R',row,col+1,value+1,pathnum);
    }
    if(row<matrix.length-1){
        maze(matrix,p+'D',row+1,col,value+1,pathnum);
    }
    if(row>0){
        maze(matrix,p+'U',row-1,col,value+1,pathnum);
    }
    if(col>0){
        maze(matrix,p+'L',row,col-1,value+1,pathnum);
    }
     matrix[row][col]=true;
         pathnum[row][col]=0;

}	
	
 	
}
