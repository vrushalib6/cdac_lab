import java.util.Stack;
import java.util.Scanner.*;

public class BalancedParentheses2{

    static public boolean balancedparantheses(String inputstr){

        Stack<E> stack = new Stack();
        char arr[] = inputstr.toCharArray();

        for(int i=0;i<arr.length;i++){
            char current = arr[i];
            if(current=='{' || current=='[' || current=='('){
                stack.push(current);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char popchar;
            switch(current){
                case ')':
                        popchar=(char)stack.pop();
                        if(popchar=='{' || popchar=='[')
                        return false;
                        break;

                case '}':
                        popchar=(char)stack.pop();
                        if(popchar=='(' || popchar=='[')
                        return false;
                        break;
                        
                case ']':
                        popchar=(char) stack.pop();
                        if(popchar=='(' || popchar=='{')
                        return false;
                        break;        
             }
             
        }
        return (stack.isEmpty());
    }




    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String inputstr = sc.nextLine();

       // String inputstr="{([])[]}";

       
        if(balancedparantheses(inputstr)){
            System.out.println(inputstr+"is Balanced");
        }
        System.out.println(inputstr+"Not Balanced");
    }
}