

import java.util.Scanner;

public class isPrime {

    public static void primeOrNot(int n) {
        for(int i=2;i<=n/2;i++) {
            if(n%i == 0) {
                System.out.println("The number "+n+" is not prime!!!");
                return;
            }
        } 

        System.out.println("The number "+n+" is Prime $$$");
    }
    
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether prime or NOt! :> ");
        n = sc.nextInt();

        primeOrNot(n);


    }
}
