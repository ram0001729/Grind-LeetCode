class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //System.out.println(reversematrix(matrix));
                return reversematrix(matrix); 
                }
 static ArrayList<Integer> reversematrix(int[][] matrix){
    ArrayList<Integer> sol= new ArrayList<Integer>();
     int rs=0;
     int cs=0;
     int re=matrix.length-1;
     int ce=matrix[0].length-1;
     while(rs<=re && cs<=ce){
       for(int i=cs;i<=ce;i++){
        sol.add(matrix[rs][i]);
        }
          for(int j=rs+1;j<=re;j++){
            if(cs==ce){
                break;
            }
            sol.add(matrix[j][ce]);
        }
          for(int k=ce-1;k>=cs;k--){
            if(rs==re){
                break;
            }
        sol.add(matrix[re][k]);
        }
          for(int l=re-1;l>=rs+1;l--){
            sol.add(matrix[l][cs]);
        }
        rs=rs+1;
        re=re-1;
        cs=cs+1;
        ce=ce-1;
        }
        return sol;
 }

}
