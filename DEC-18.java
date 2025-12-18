public class suduko_solver {

public static boolean isSafe(int[][] sudukogrid,int row,int col,int digit){
for(int j=0;j<9;j++){
if(sudukogrid[row][j]==digit){
    return false;
}
}
for(int j=0;j<9;j++){
if(sudukogrid[j][col]==digit){
    return false;
}
}
int grow=(row/3)*3;
int gcol=(col/3)*3;
for(int i=grow;i<grow+3;i++){
    for(int j=gcol;j<gcol+3;j++){
        if(sudukogrid[i][j]==digit){
            return false;
        }
    }
}
return true;
}
public static void printsuduko(int[][] sudukogrid) {
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            System.out.print(sudukogrid[i][j] + " ");
        }
        System.out.println(); // move to next row
    }
}

public static boolean suduko(int[][] sudukogrid,int row,int col){
//base case;
if(row==9){
    printsuduko(sudukogrid);
    return true;
}
int newrow=row;int newcol=col+1;
if(newcol==9){
    newrow=row+1;
    newcol=0;
}
if (sudukogrid[row][col] != 0) {
            return suduko(sudukogrid, newrow, newcol);
        }
 for(int digit=1;digit<10;digit++){
    if(isSafe(sudukogrid,row,col,digit)){
    sudukogrid[row][col]=digit;
   if(suduko(sudukogrid,newrow,newcol)){
    return true;
   }
    
    sudukogrid[row][col]=0;
    }
}
 return false;
}

public static void main(String[] args){
int[][] sudukogrid = {
    {5, 3, 0, 0, 7, 0, 0, 0, 0},
    {6, 0, 0, 1, 9, 5, 0, 0, 0},
    {0, 9, 8, 0, 0, 0, 0, 6, 0},
    {8, 0, 0, 0, 6, 0, 0, 0, 3},
    {4, 0, 0, 8, 0, 3, 0, 0, 1},
    {7, 0, 0, 0, 2, 0, 0, 0, 6},
    {0, 6, 0, 0, 0, 0, 2, 8, 0},
    {0, 0, 0, 4, 1, 9, 0, 0, 5},
    {0, 0, 0, 0, 8, 0, 0, 7, 9}
};
int row=0;
int col=0;
suduko(sudukogrid,0,0);

}


}
