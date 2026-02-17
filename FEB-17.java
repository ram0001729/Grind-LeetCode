public class build_BST {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
         this.val=val;
         this.left=null;
         this.right=null;
        }
    }
public static void inorder(Node root){
    if(root==null){
        return;
    }
 

    inorder(root.left);
    System.out.print(root.val+" ");
    inorder(root.right);
}

public static Node BST(Node root,int val){
    if(root==null){
       root=new Node(val);
       return root;
    }

if(val>root.val){
    root.right=BST(root.right,val);
}

else if(val<root.val){
    root.left=BST(root.left,val);
}
 return root;
}

public static void main(String args[]){
    int values[]={2,7,0,8,1};
    Node root=null;
    for(int i=0;i<values.length;i++){
      root=BST(root,values[i]);
    }
            inorder(root);

}


}
