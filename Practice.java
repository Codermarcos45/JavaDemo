class Practice {
    public static void diagonalSum(int arr[][]) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i][i];

            if(i != arr.length-1-i) 
                sum += arr[i][arr.length-1-i];
        }

        System.out.println("SUM = "+sum);

        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(matrix);
    }
}