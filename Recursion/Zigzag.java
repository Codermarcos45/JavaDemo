package Recursion;

import java.util.Scanner;

public class Zigzag {

    public static void printZigzag(int n) {
        if(n==0) return;

        System.out.print(n+" ");
        printZigzag(n-1);
        System.out.print(n+" ");
        printZigzag(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        printZigzag(n);
    }
    
}
