package TwoDArraysQuestions;
/*
 Question : You are given an n x n 2D matrix. You have to find the largest prime number from the diagonals.
 */

public class DiagonalPrimeProblem {
    public static int maxDiagonalPrime(int matrix[][]) {
        int maxPrime = 0;

        for(int i=0;i<matrix.length;i++) {
            if(isPrime(matrix[i][i])) maxPrime = Math.max(maxPrime,matrix[i][i]);
            if(isPrime(matrix[i][matrix.length-1-i])) maxPrime = Math.max(maxPrime,matrix[i][matrix.length-1-i]);
        }
        return maxPrime;
    }

    public static boolean isPrime(int num) {
        if(num < 2) return false;

        for(int i=2;i<= Math.sqrt(num);i++) {
            if(num%i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{5,17,7},{9,10,11}};
        System.out.println(maxDiagonalPrime(matrix));

    }
}
