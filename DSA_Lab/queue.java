import java.util.Scanner;

public class queue{
    int n=10;
    private
            int arr[] ;
             int front;
            int back;

          public  queue( ){
                arr  = new int[n];
                front=-1;
                back=-1;
            }

            void push(int x){
                if(back==(n-1)){
                    System.out.println("Queue is full");
                }
                back++;
                arr[back] = x;

                if(front ==-1)
                front++;
            }

            void pop(){
                if(front==-1 || front>back){
                    
                    System.out.println("queue is empty");
                }
                
                if (front >= back)//reset values back to -1 then increment the front
		        {
			        front = -1;
			        back = -1;
		        }
                front++;

            }

            void peek(){
                if(front==-1 || front>back){
                    System.out.println("Queue is empty");
                    
                }
                for(int i = front; i<=back;i++){
                    System.out.println(arr[i]);
                }
                

            }
            bool empty(){
                if(front==-1 || front>back){
                    System.out.println("Queue is empty");
                }
            }

            public static void main(String args[]){
                
               
                queue q = new queue();
                
                q.push(20);
                q.push(30);
                q.push(40);
                q.push(50);

               
                q.pop();
                 q.pop();
                  q.pop();
                  q.pop();
                  q.pop();

              
                 q.push(50);
                 q.push(90);
                 q.push(45);
                 q.push(100);

                 q.peek()  ;


            }

}