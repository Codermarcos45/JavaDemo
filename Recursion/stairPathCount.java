import java.util.Scanner;

public class stairPathCount {
    
    public static int stairPath(int n) {
        //base case 
        if(n<=2) return n;

        return stairPath(n-1) + stairPath(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of paths : ");
        int n = sc.nextInt();

        System.out.println("Total number of ways : "+stairPath(n));
    }
}
