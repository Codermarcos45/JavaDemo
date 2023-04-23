class Practice {
    public static int clearRangeOfBits(int n, int sI,int eI) {
        int a = (~0)<<eI+1;
        int b = (1<<sI)-1;

        return n & (a|b);
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10, 2, 5));
    }
}   