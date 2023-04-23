package BitManipulation;

public class ClearRangeOfBits {

    public static int clearRangeOfBits(int num,int sI,int eI) {
        int a = (~0)<<eI+1;
        int b = (1<<sI)-1;

        return num &(a|b);

    }
    public static void main(String[] args) {
        System.out.println( clearRangeOfBits(558, 3, 7));
    }
    
}
