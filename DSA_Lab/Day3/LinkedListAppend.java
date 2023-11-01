public class LinkedListAppend {

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
    while (temp!=null) {
        System.out.print(temp.data+" ");

        temp  = temp.next;
        
    }
    }

    void insertBegining(int d){
        Node newnode = new Node(d);
        newnode.next   = head;
        head = newnode;
    }

    void append(int d){
        Node newnode  = new Node(d);
        if(head == null){
            head = newnode;
        }

        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newnode;
        return;
    }

    public static void main(String[] args) {
        
        LinkedListAppend l = new LinkedListAppend();
        l.head  = new Node(10);
         Node first  =  new Node(20);
         Node second  = new Node(30);
          Node third  = new Node(40);

         l.head.next = first;
         first.next = second;
         second.next = third;

         l.display();
         l.insertBegining(50);
         System.out.println();
         l.display();
          System.out.println();
         l.append(60);
         l.display();

    }
    
}
