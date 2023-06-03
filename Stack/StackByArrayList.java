package Stack;
import java.util.ArrayList;

public class StackByArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //If stack is empty : 
        public boolean isEmpty() {
            return list.size() == 0;
        }

        //push  -> O(1)
        public void push(int data) {
            list.add(data);
        }

        //pop -> O(1)
        public int pop() {
            if(isEmpty()) return Integer.MIN_VALUE;     //if stack is empty!
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek -> O(1)
        public int peek() {
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        
        while(!s1.isEmpty()) {
            System.out.println(s1.pop());
        }

        
    }
    
}
