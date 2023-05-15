import java.util.Scanner;

public class LargestAmongThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n = sc.nextInt();
        System.out.println("Enter second number : ");
        int m = sc.nextInt();
        System.out.println("Enter third number : ");
        int p = sc.nextInt();


        if(n > m) {
            if(n > p) {
                System.out.println("Largest number is : "+n);
                return;
            } else {
                System.out.println("Largest number is : "+p);
            }
        } else {
            if(m > p) {
                System.out.println("Largest number is : "+m);
            } else {
                System.out.println("Largest number is : "+p);
            }
        }
    }
    
}
