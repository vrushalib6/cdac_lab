public class LinkedListInsert {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void display(){
        Node temp  = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp  = temp.next;
        }
    }
     void insertBegining(int d){
        Node newnode = new Node(d);
        newnode.next = head;
        head = newnode;
     }

    public static void main(String[] args) {
        LinkedListInsert l  = new LinkedListInsert();
        l.head = new Node(10);
        Node first  =new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        l.head.next = first;
        first.next = second;
        second.next = third;

        l.display();
        System.out.println();
        
        l.insertBegining(50);
        l.display();

        System.out.println();
        
        l.insertBegining(60);
        l.display();

        System.out.println();
        
        l.insertBegining(70);
        l.display();
    }
    
}
