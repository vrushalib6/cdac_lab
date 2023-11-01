public class BST{

    Node root;
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data= data;
            left=null;
            right=null;
        }
    }
    BST(){
        root=null;
    }
    BST(int d){
        root = new Node(d);
    }

    void printInorder(Node root){
        if(root==null)
        return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }

    void printPreorder(Node root){
        if(root==null)
        return;
        System.out.print(root.data+" ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    void printPostorder(Node root){
        if(root==null)
        return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data+" ");
    }

    void Inorder(){
        printInorder(root);
    }

    void Preorder(){
        printPreorder(root);
    }

    void Postorder(){
        printPostorder(root);
    }

   Node insertdata(Node root,int key){
            if(root==null){
                root = new Node(key);
                return root;
             }
             if(key<=root.data)
                root.left = insertdata(root.left, key);
             else
                root.right= insertdata(root.right, key);

    return root;

    }

    void insert(int key){
        root = insertdata(root,key);
    }

    public static void main(String[] args) {
        BST b = new BST();

        b.insert(20);
        b.insert(30);
        b.insert(80);
        b.insert(78);
        b.insert(63);
        b.insert(90);

        System.out.println("Inorder");
		b.Inorder();
		
		System.out.println();
		System.out.println("Preorder");
		b.Preorder();
		
		
		System.out.println();
		System.out.println("Postorder");
		b.Postorder();

    }
}