/*
 * Reverse a stack : 
 * Time complexity : O(n)
 * Space complexity : O(1)
 */
package Stack;
import java.util.Stack;

public class QSReverseAStack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        //base case 
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        //base case 
        if(s.isEmpty()) return;     //if stack is empty that means stack is already reversed

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void display(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        display(s);

    }
    
}
