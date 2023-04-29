package Recursion;

public class PreInPost {
    public static void preInPostFunction(int n) {
        if(n==0) return;

        System.out.println("Pre -> "+n);
        preInPostFunction(n-1);
        System.out.println("In -> "+n);
        preInPostFunction(n-1);
        System.out.println("Post -> "+n);
    }
    public static void main(String[] args) {
        preInPostFunction(2);
    }
    
}
