
import java.util.Stack;
public class reverseastring {
    public static String reversestring(String str){
        Stack<Character> s=new Stack<>();
        int index=0;
while(index < str.length()){
    s.push(str.charAt(index));
    index=index+1;
}
   StringBuilder result=new StringBuilder("");
   while(!s.isEmpty()){
   char c=s.pop();
   result.append(c);
    }
    return result.toString();
}
 public static void main(String args[]){
    String str="abc";
    String reversed = reversestring(str);
    System.out.println(reversed);

}


}
