public class permutations {
    
public static void permut(String str,String ans){
if(str.length()==0){
    System.out.println(ans);
    return;
}
for(int i=0;i<str.length();i++){
    char chu=str.charAt(i);
    String Newstr=str.substring(0,i)+str.substring(i+1);
    permut(Newstr,ans+chu);
}
}
public static void main(String[] args){
    String str="abc";
    String ans=" ";
    permut(str,ans);

}


}
