class Solution {
    public int uniquePaths(int m, int n) {
        int right,down;
      if(m==1||n==1 ){
        return 1;
      }  
       down=uniquePaths(m-1,n);
      right=uniquePaths(m,n-1);
           return down+right;
    }
 }
