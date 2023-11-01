public class LinkedListInsertAfter {
    
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data= d; 
            next = null;
        }
    }

    void display(){
        

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp  =temp.next;
        }
    }

    void insert(int d){
       
        Node newnode = new Node(d);
        newnode.next = head;
        head = newnode;
    }

    void insertAfter(Node prev, int data){
        if(prev==null)
        return;
        Node newnode = new Node(data);
        newnode.next = prev.next;
        prev.next = newnode;


    }

    public static void main(String[] args) {
        
        LinkedListInsertAfter l  = new LinkedListInsertAfter();
        l.head = new Node(10);
        l.display();
        System.out.println();
        l.insert(20);
        l.display();
        System.out.println();

        l.insert(30);
        l.display();
        System.out.println();

        l.insertAfter(l.head.next, 55);
        l.display();
        System.out.println();

        

        

         
    }
}
