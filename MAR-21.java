class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        int top=0;
        int down=n-1;
        while(top<down){
            if(mat[top][down]==1){
                top=top+1;
            }else{
                down=down-1;
            }
                
                
            }
                
                
       int candidate=top;
       for(int i=0;i<n;i++){
           if(candidate==i){
               continue;
           }
            if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                return -1;
            }
       }
   return candidate;
    }
}
