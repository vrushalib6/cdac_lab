
public class BST2 {

    Node root;
    static class Node{
        int data;
        Node left,right;

        Node(int d){
            data= d;
            left=right=null;
        }
    }

    BST2(){
        root =null;
    }
    BST2(int d){
        root = new Node(d); 
    }

   Node insertdata(Node root,int key){
        if(root==null){
            root = new Node(key);
        return root;
      }
        if(key<root.data){
            root.left = insertdata(root.left,key);
        }
        else{
            root.right = insertdata(root.right,key);
        }
        return root;
    }

    void insert(int key){
        root = insertdata(root,key);
    }

    void printInorder(Node root){
        if(root==null)
        return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }

    void inorder(){
        printInorder(root);
    }

    Node deletedata(Node root, int key){
        if(root==null)
        return root;
        if(key<root.data)
      root.left =  deletedata(root.left, key);
      else if(key>root.data)
      root.right = deletedata(root.right, key);
      else{
        if(root.left==null)
        return root.right;
        else if(root.right==null)
        return root.left;

        root.data = minvalue(root.right);
        root.right = deletedata(root.right,root.data);
      }
      return root;
    }

    int minvalue(Node root){
        int x = root.data;
        while(root.left!=null){
            x = root.left.data;
            root= root.left;
        }
        return x;
    }
    void delete(int key){
        root = deletedata(root,key);
    }



    public static void main(String[] args) {
        BST2  b = new BST2(10);
        b.insert(8);
        b.insert(25);
        b.insert(5);
        b.insert(9);
        b.insert(22);
        b.insert(42);
        b.insert(2);

        b.inorder();
         System.out.println();

        b.delete(9);
        b.inorder();
        System.out.println();

        b.delete(5);
        b.inorder();
         System.out.println();

        b.delete(25);
        b.inorder();
        System.out.println();

        b.delete(10);
        b.inorder();




    }
    
}
