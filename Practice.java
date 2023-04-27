import java.util.Scanner;

public class Practice {
    
    public static int stairPath(int n) {
        //base case 
        if(n==1||n==2) return n;
        if(n==3) return 4;

        return stairPath(n-1) + stairPath(n-2) + stairPath(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of paths : ");
        int n = sc.nextInt();

        System.out.println("Total number of ways : "+stairPath(n));
    }
}
