//Question : Check a number is power of 2 or not.


package BitManipulation;

public class IsPowerOfTwo {
    public static boolean isPower(int num) {
       return (num&(num-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPower(64));
        
    }
}
