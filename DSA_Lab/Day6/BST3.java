public class BST3 {
    Node root;
    static class Node{
        int data;
        Node left,right;

        Node(int d){
            data = d;
        }

    }

    BST3(){
        root=null;
    }
    BST3(int key){
       root =  new Node(key);
    }

Node insertData(Node root, int key){
    if(root==null){
        root = new Node(key);
        return root;
    }
    if(key < root.data)
        root.left = insertData(root.left,key);
     else
     root.right = insertData(root.right,key);   
     return root;
    
}

void insert(int key){
   root=  insertData(root,key);

}
Node printInorder(Node root){
    if(root==null)
    return root;
    printInorder(root.left);
    System.out.print(root.data+" ");
    printInorder(root.right);

    return root;
}
void inorder(){
    root = printInorder(root);
}

Node DeleteData(Node root,int key){
    if(root==null)
    return root;
    if(key<root.data){
        root.left = DeleteData(root.left,key);
    }
    else if(key>root.data){
        root.right = DeleteData(root.right,key);
    }
    else{
        if(root.left==null)
        return root.right;
        else if(root.right==null)
        return root.left;

        root.data = minvalue(root.right);
        root.right = DeleteData(root.right, root.data);
    }
    return root;
}
int minvalue(Node root){
    int x=root.data ;
    while(root.left!=null){
        x = root.left.data;
        root = root.left;
    }
    return x;
}
void delete(int key){
    root = DeleteData(root,key);
}


    public static void maiin(String args[]){
         BST3 B  = new BST3(10);
         B.insert(8);
          B.insert(25);
           B.insert(5);
            B.insert(9);
             B.insert(25);
              B.insert(22);
               B.insert(42);

               B.inorder();
    } 
    
}
