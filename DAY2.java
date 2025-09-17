import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int[] arr = {12,1,3,4,3,5,4,3,32};
 List<List<Integer>> ans=removing(arr);
 for(List<Integer> list:ans){
      System.out.println(list);

 }
 	}
 static List<List<Integer>> removing(int[] arr){
	     List<List<Integer>> outer =new ArrayList<>();
	     outer.add( new ArrayList<>());
 	     for(int nums :arr ){
	          int n= outer.size();
        for(int i=0;i<n;i++){
            List internal=new ArrayList<>(outer.get(i)); 
            internal.add(nums);
            outer.add(internal);
        }
	   }
 	    return outer;
	    }
}
