import java.util.Scanner;

public class FirstPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i=2;i<=n;i++) {
            boolean flag = true;
            
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) System.out.println(i);
        }
    }
    
}
