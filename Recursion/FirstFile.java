/*
 Recursion : A function which calls himself says recursive function and this process is called Recursion.
 Steps : 1) Base case define karna
         2) Kuch kam krna
         3) Inner function ko call krna
 */

package Recursion;


public class FirstFile {
    public static void printNumbers(int n) {
        //base case 
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
        
        
    }
    public static void main(String[] args) {
        printNumbers(5);
    }
}
