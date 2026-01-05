import java.util.*;
public class pushatbottom {
   public static void bottom(Stack<Integer> s,int num){
    if(s.isEmpty()){
        s.push(num);
        return;
    }
 int top=s.pop();
 bottom(s,num);
 s.push(top);

} 
public static void main(String args[]){
    int num=5;
     Stack<Integer> s= new Stack<>();
     s.push(8);
     s.push(10);
     s.push(25);
     bottom(s,5);
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }



    }
}
