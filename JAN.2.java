public class mnodesmnodes {
    public static  class NodeList{
        int data;
        NodeList next;
    public NodeList(int data){
        this.data=data;
        this.next=null;
    }
public NodeList del(NodeList prev,NodeList curr,int N){
    int count2=0;
    while(curr!=null  && count2<N){
        
        count2=count2+1;
        curr=curr.next;
    
         
    }
    prev.next=curr;

    return curr;
}

public  NodeList dele(NodeList head, int M, int N){
   if(head==null){
        return head;
    }
   NodeList curr=head;
   NodeList prev=null;
   int count=0;
  while(curr!=null && count<M){
    count=count+1;
        prev=curr;
        curr=curr.next;
        // prev.next=cur;
 }

  if (prev == null) return head;
      NodeList cur  = del(prev,curr,N);
      dele( cur, M, N);
return head;
}

}


