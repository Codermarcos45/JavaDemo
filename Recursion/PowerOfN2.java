//Calculate power of N by using optimized approch
//Time complexity : O(log n)



public class PowerOfN2 {
    public static int fastPower(int x,int n) {
        //base case 1
        if(n==0) return 1;
        //base case 2
        if(x==0) return 0;

        int temp = fastPower(x, n/2);

        //if n is even
        if(n%2 == 0) return temp * temp;
        
        //if n is odd
        return x * temp * temp;

    }
    public static void main(String[] args) {
        System.out.println(fastPower(2, 1));
    }
    
}
