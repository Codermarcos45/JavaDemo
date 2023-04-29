/*
 Binary Strings Problem : 
 Print all binary strings of size N without consecutive ones.

 Also try to solve this porblem without consecutive zeros.
 */

package Recursion;

public class BinaryStringsProblem {
    public static void binaryStrings(int n, int lastPlace,String sb) {
        if(n==0) {
            System.out.println(sb);
            return;
        }

        binaryStrings(n-1, 0, sb+"0");

        if(lastPlace == 0) binaryStrings(n-1, 1, sb+"1");
    }
    public static void binaryZeroStringsProblem(int n, int lastPlace, String str) {
        if(n==0) {
            System.out.println(str);
            return;
        }

        binaryZeroStringsProblem(n-1, 1, str+"1");

        if(lastPlace == 1) binaryZeroStringsProblem(n-1, 0, str+"0");
    }

    public static void main(String[] args) {
        binaryStrings(4,0,"");
        System.out.println("---------------------------------------------->>>");
        binaryZeroStringsProblem(4, 1, "");
    }
    
}
