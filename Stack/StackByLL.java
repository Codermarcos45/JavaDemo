package Stack;

import java.time.chrono.IsoEra;

public class StackByLL {

    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }

    static class Stack {
        Node head = null;


        // If stack is empty 
        public boolean isEmpty() {
            return head == null;
        }

        //push -> O(1)
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        //pop -> O(1)
        public int pop() {
            if(isEmpty()) return Integer.MIN_VALUE;

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek -> O(1)
        public int peek() {
            if(isEmpty()) return Integer.MIN_VALUE;
            return head.data;
        }
    }
 
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        while(!s1.isEmpty()) {
            System.out.println(s1.pop());
        }
    }
}
