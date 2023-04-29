class Practice {
    public static void binaryZeroStringsProblem(int n, int lastPlace, String str) {
        if(n==0) {
            System.out.println(str);
            return;
        }

        binaryZeroStringsProblem(n-1, 1, str+"1");

        if(lastPlace == 1) binaryZeroStringsProblem(n-1, 0, str+"0");
    }
    public static void main(String[] args) {
        binaryZeroStringsProblem(4, 1, "");
    }
}