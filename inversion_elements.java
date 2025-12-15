public class inversion_check {
    public static  int sort(int[] arr,int start,int end){
        int count=0;
   if(start>=end){
    return 0;
   }
  int mid=(start+end)/2;
  count=count+sort(arr,start,mid);
  count=count+sort(arr,mid+1,end);
 count=count+merg(arr,start,mid,end);
return count;
}
public static  int merg(int[] arr,int start,int mid,int end){
    int i=start;
    int j=mid+1;
    int k=0;
    int count=0;
    int[] temp=new int[end-start+1];
   while(i<=mid && j<=end){
    if(arr[i]<=arr[j]){
        temp[k]=arr[i];
        i=i+1;
     } else{
        temp[k]=arr[j];
        for(int x=i;x<=mid;x++){
        System.out.println((arr[x]+"  ,"+arr[j-1]));
    }
        count=count+mid-i+1;
          j=j+1;

    }
       k=k+1;
   }
  while(i<=mid){
        temp[k++]=arr[i++];
  }
while( j<=end){
    temp[k++]=arr[j++];
}
for(i = 0; i < temp.length; i++) {
    arr[start + i] = temp[i];
}

return count;
}
public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
         System.out.println(sort(arr, 0, arr.length - 1));
 
}

}
