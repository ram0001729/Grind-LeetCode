public class N_Queens {

public static boolean isSafe(char[][] board,int row,int col){
 for(int i=row-1;i>=0;i--){
    if(board[i][col]=='Q'){
       System.out.println(count);
        return false;
    }
}
for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
    if(board[i][j]=='Q'){
        return false;
    }
}
for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
 if(board[i][j]=='Q'){
        return false;
    }
}
return true;
}


  public static void printBoard(char[][] board) {
    System.out.println("------ CHESS BOARD ------");

    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
            System.out.print(board[i][j] + "  ");
        }
        System.out.println();
    }

    System.out.println();
}

public static void nights(char[][] board,int row){
    int count;
 if(row==board.length){
    printBoard(board);
   return; 
}
for(int i=0;i<board.length;i++){
    if(isSafe(board,row,i)){
        board[row][i]='Q';
       nights(board,row+1);
        board[row][i]='X';
    }
}
 }

public static void main(String[] args){
        int n=4;
        char[][] board=new char[n][n];
        for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
        board[i][j] = 'X';
    }
}

        nights(board,0);
}
}
