import java.util.Scanner;

public class oddEven {

    public static void isOddEven(int n) {
        if(n%2 == 0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd");
        }
    }
 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's odd or even :> ");
        n = sc.nextInt();

        isOddEven(n);
    }
}
