public class grid_problem {
   public static int grid(int n,int m,int i,int j){
    if(i==n-1 && j==m-1){
        return 1;
    }else if (i>=n || j>=m) {
        return 0;
    }
    
   int right =grid(n,m,i,j+1);
   int down=grid(n,m,i+1,j);

return right+down;

}
public static void main(String[] arg){
    int i=0;
    int j=0;
    int m=5;
    int n=5;
   System.out.println(grid(n,m,i,j));
}


}
