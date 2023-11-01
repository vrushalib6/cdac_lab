public class BST4 {

    Node root;
    static class Node{
        int data;
        Node left,right;

        Node(int d){
            data=d;
            left=right=null;

        }
    }

    BST4()
    {
        root= null;
    }

    BST4(int key){
        new Node(key);
    }
Node deleteData(Node root, int key){
    if(root==null)
    return root;
    if(key<root.data)
        root.left = deleteData(root.left, key);
         else if(key>root.data)
        root.right = deleteData(root.right, key);
    else{
        if(root.left==null)
         return root.right;
        else if(root.right==null)
         return root.left;
         
         root.data =  minvalue(root.right);
         root.right = deleteData(root.right, root.data);

    }  
    return root;
}  

int minvalue(Node root){
    int x = root.data;
    while(root.left!=null){
        x=  root.left.data;
        root = root.left;
        
    }
    return x;
}


void delete(int key){
    root = deleteData(root,key);
}


Node insertData(Node root,int key){
    if(root==null){
        root = new Node(key);
        return root;
    }
    if(key<=root.data)
        root.left = insertData(root.left,key);
       else 
      root.right = insertData(root.right,key);
      
      return root;
}
void insert(int key){
    root = insertData(root,key);
}

Node printInorder(Node root){
    if(root==null)
    return root;

    else{
    printInorder(root.left);
    System.out.print(root.data+" ");
    printInorder(root.right);

    return root;}
}

void inorder(){
    root = printInorder(root);
}

    public static void main(String[] args) {
        BST4 B = new BST4(10);
        B.insert(8);
        B.insert(25);
        B.insert(5);
        B.insert(9);
        B.insert(22);
        B.insert(42);
        B.insert(2);

        B.inorder();

        System.out.println();
        B.delete(9);

        B.inorder();
         System.out.println();
        B.delete(5);

        B.inorder();
         System.out.println();
        B.delete(25);
        B.inorder();

        
    }
}
