
import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=4;
        boolean[][] matrix =new boolean[n][n];
        System.out.println(placing(matrix,0));
     }
 //checking the safe place;
     static boolean issafe(boolean[][] matrix,int row,int col){
         for(int i=0;i<row;i++){
             if(matrix[i][col]){
                return false;             }
         }
         //diagonal right checking;
         int min=Math.min(row,matrix.length-col-1);
         for(int i=1;i<=min;i++){
            if(matrix[row-i][col+i]){
                return false;
            }
         }
         //diagonal left checking;
          int mini=Math.min(row,col) ;
         for(int i=1;i<mini;i++){
            if(matrix[row-i][col-i]){
                return false;
            }
         }
         return true;
     } 
      
   static int placing(boolean[][] matrix,int row){
          if(row==matrix.length){
          display(matrix);
          System.out.println();
           return 1;
      }
       int count=0;
       for(int col=0;col<matrix.length;col++){
           if(issafe(matrix,row,col)){
               matrix[row][col]=true;
               count=count+placing(matrix,row+1);
               matrix[row][col]=false;
           }
       }
       
       return count;
   }   
      
    static void display(boolean[][] matrix){
     for(boolean[ ] row:matrix){
          for(boolean element:row){
              if(element){
                  System.out.print("Q");
              }
              else{
                  System.out.print("x");
              }
          }
         System.out.println();
 
      }
      }
}
    
