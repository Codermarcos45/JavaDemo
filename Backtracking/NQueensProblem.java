/* 
 Place N queens on an NxN chessboard such that no 2 queens can attack each other.
 Possible Questions : 
 1)Print all possible solutions.
 2) If any solution is present then print anyone else print solution not possible
 3) Count all possible solutions.

 Time complexity : O(n!)

 */
package Backtracking;

public class NQueensProblem {
    static int count = 0;
    public static void printArr(char arr[][]) {
        System.out.println((++count)+" no "+"---------- chess board ----------");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            } System.out.println();
        }
        
    }

    public static boolean isSafe(char board[][],int row,int col) {

        //vertical up safe? 
        for(int i=row-1;i>=0;i--) {
            if(board[i][col] == 'Q') return false;
        }

        //diagonal left up safe?    
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(board[i][j] == 'Q') return false;
        }

        //diagonal right up safe? 
        for(int i=row-1,j=col+1;i>=0 && j<=board[0].length-1;i--,j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
    public static boolean nQueens(char board[][], int row) {
        //base case
        if(row==board.length) {
            // printArr(board);
            // return;
            return true;
        }

        //column loop
        for(int i=0;i<board.length;i++) {
            if(isSafe(board, row, i)) {       //Placing queens is safe?
                board[row][i] = 'Q';
                if(nQueens(board, row+1)) return true;      //recursive call
                board[row][i] = 'x';        //backtracking step
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        //initializing the board with 'x';
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                board[i][j] = 'x';
            }
        }

        // nQueens(board, 0);
        // System.out.println("Total possible solutions : "+count);
        if(nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printArr(board);
        }
    }    
}
