package TwoDArraysQuestions;


public class DiagonalSum {
    public static int diagonalSum1(int array[][]) {      //brute force approach O(n^2)
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[0].length;j++) {
                if(i == j || i+j == array.length-1) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }

    public static int diagonalSum2(int arr[][]) {      //linear approach O(n)
        int sum = 0;
        
        for(int i=0;i<arr.length;i++) {
            //primary diagonal
            sum += arr[i][i];

            //secondary diagonal
            if(i != arr.length-1-i)
                sum += arr[i][arr.length-1-i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int array[][] = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        System.out.println("DIAGONAL SUM : "+diagonalSum1(array));
        System.out.println("DIAGONAL SUM : "+diagonalSum2(array));
    }
    
}
