

public class FibonacciSeries {
    public static void printFiboSeries(int a,int b,int n) {
        //base case
        if(n==0) {
            return;
        }

        int c= a+b;
        System.out.println(c);
        printFiboSeries(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1,n = 10;
        System.out.println(a);
        System.out.println(b);

        printFiboSeries(a, b, n-2);
        

    }
    
}
