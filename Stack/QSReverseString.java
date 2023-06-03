package Stack;

import java.util.Scanner;

//Reverse a string using Stack.

import java.util.Stack;

public class QSReverseString {
    public static String reverseString(String str) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < str.length()) {
            st.push(str.charAt(i++));
        }

        StringBuilder sb = new StringBuilder("");

        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }
 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(reverseString("Hello World"));
    }
}
