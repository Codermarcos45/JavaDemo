import java.util.Scanner;

//Question : Print sum of 1 to n (parameterized)

public class NaturalSum2 {
    
    public static void printSum(int n,int sum) {
        if(n==0) {
            System.out.println(sum);
            return;
        }

        printSum(n-1, sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("----------------------------------------------------->");
        printSum(n, 0);
    }
}
