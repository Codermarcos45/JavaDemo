//Time complexity : O(n)


public class PowerOfN {
    public static int power(int x,int n) {
        //base case 1
        if(x==0) return x;

        //base case 2
        if(n==0) return 1;
            
        //recursive work
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 1));
    }
    
}
