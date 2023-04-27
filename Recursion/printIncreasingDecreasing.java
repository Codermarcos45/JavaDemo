import java.util.Scanner;

public class printIncreasingDecreasing {
    public static void increasingDecreasing(int n) {
        if(n==1) {
            System.out.println(n);
            System.out.println(n);
            return;
        }
        System.out.println(n);
        increasingDecreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("----------------------------------------------------------->>>>>");
        increasingDecreasing(n);
    }
    
}
