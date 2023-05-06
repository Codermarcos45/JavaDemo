/*
 Place N queens on an NxN chessboard such that no 2 queens can attack each other.
 2) If any solution is present then print anyone else print solution not possible.
 */

 public class NQueensIsPossible {

    public static boolean isPossible(char board[][],int row) {
        if(row == board.length) return true;

        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                if(isPossible(board, row+1)) return true;
                board[row][j] = 'x';
            }

        }

        return false;
    }

    public static boolean isSafe(char board[][],int row,int col) {
        //vertical up
        for(int i=row-1;i>=0;i--) {
            if(board[i][col] == 'Q') return false;
        }

        //diagonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') return false;
        }

        //diagonal right
        for(int i=row-1,j=col+1;i>=0 && j<=board.length-1;i--,j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;

    }
    public static void main(String[] args) {
        int n = 4;

        char board[][] = new char[n][n];

        //initialize the board with 'x'
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                board[i][j] = 'x';
            }
        }

        if(isPossible(board, 0)) {
            System.out.println("Solution is possible :> ");
            printArr(board);
        } else {
            System.out.println("Solution is not possible!!!");
        }

    }

    public static void printArr(char arr[][]) {
        System.out.println("-------------- chess board --------------");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
 }