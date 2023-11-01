public class LinkedListDeleteNode {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    void insert(int d){
        Node newnode = new Node(d);
        newnode.next = head;
        head= newnode;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    void deletenode(int key){
       Node temp = head,prev=null;

       if(temp==null)
       return;
      

       if(temp.next!=null && temp.data==key){
        head = temp.next;
        return;
       }

       while(temp!=null && temp.data!=key){
        prev = temp;
        temp =temp.next;
       }
        prev.next = temp.next;


    }
    public static void main(String[] args) {
        LinkedListDeleteNode l = new LinkedListDeleteNode();
        l.head = new Node(10);

        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.display();
        System.out.println();
        l.deletenode(30);
       
        l.display();
    }
    
}
