
public class LinkedList1 {
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
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data+" ");
            temp  = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList1 l = new LinkedList1();
        l.head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third  =new Node(40);

        l.head.next = first;
        first.next = second;
        second.next = third;

        l.display();
    }


}
