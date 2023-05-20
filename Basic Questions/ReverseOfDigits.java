import java.util.Scanner;

public class ReverseOfDigits {

    public static void reverse1(Integer n) {

        String str = n.toString();

        StringBuilder sb = new StringBuilder(str).reverse();

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it's digits : ");
        
        int n = sc.nextInt();

        int rem = 0;
        int reverse = 0;


        while(n > 0) {
            rem = n % 10;
            reverse =  reverse * 10 + rem;
            n /= 10;
        }

        System.out.println("REVERSE FORM : "+reverse);

        reverse1(500433);
    }
    
}
