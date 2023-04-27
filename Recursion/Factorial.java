package Recursion;


public class Factorial {
    public static int fact(int n) {
        
        //base case
        if(n == 0|| n==1) {
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial : "+fact(5));
    }
    
}
