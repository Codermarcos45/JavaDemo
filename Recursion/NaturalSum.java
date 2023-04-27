

public class NaturalSum {
    public static int naturalSum(int n) {
        if(n==0||n==1) return n;
        
        return n + naturalSum(n-1);
        
    }
    public static void main(String[] args) {
        System.out.println("Natural Sum : "+naturalSum(10));
    }
}
