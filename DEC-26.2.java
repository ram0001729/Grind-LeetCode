public class Linked_list {
    public static  class node{
        int data;
        node next;
    public node(int data){
        this.data=data;
        this.next=null;
    }
}
public static node head;
public static node tail;
public static int size;
public void addfirst(int data){
    node newnode = new node(data);
    if(head==null){
       tail=newnode;
        head=newnode;
    }
    newnode.next=head;
    head=newnode;
}
public void addlast(int data){
    node newnodel =new node(data);
    size=size+1;
    if(head==null){
        head=newnodel;
        tail=newnodel;
    }
    tail.next=newnodel;
    tail=newnodel;
   }
public void insert(int index,int data){
  node newnode= new node(data);
  size=size+1;
  if(index==0){
    addfirst(data);
    size=size+1;
    return;
  }
  node temp=head;
  int i=0;
  while(i<index-1){
     temp=temp.next;
     i=i+1;
  }
  newnode.next=temp.next;
  temp.next=newnode;

}
   public void printlist(){
    node temp=head;
    while(temp!=null){
         System.out.println("temp.data"+temp.data);
         temp=temp.next;
      }
}
public static void main(String args[]){
Linked_list LL= new Linked_list();
LL.printlist();
LL.addfirst(3);
LL.addfirst(5);
LL.addfirst(7);
LL.addlast(9);
}
}
