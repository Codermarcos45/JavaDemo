public class Practice {

    public static int diagonalSum(int arr[][]) {
        int sum = 0;

        for(int i=0;i<arr.length;i++) {
            sum += arr[i][i];

            if(i != (arr.length-1-i))
                sum += arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{2,2,2},{3,3,3},{1,1,1}};
        System.out.println("DIAGONAL SUM ::::>>> "+diagonalSum(arr));

    }
}