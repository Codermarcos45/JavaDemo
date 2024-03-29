package Backtracking;

public class NKnightsProblem{
    static int count = 0;
    public static void nKnights(char board[][], int row) {
        //base case
        if(row == board.length) {
            printArr(board);
            ++count;
            return;
        }

        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'K';
                nKnights(board, row+1);
                board[row][j] = '-';
            }
        }
    }

    public static boolean isSafe(char board[][],int row,int col) {
        //vertical up
        for(int i=row-1;i>=0;i--) {
            if(board[i][col] == 'K') return false;
        }

        // //diagonal left
        // for(int i=row-1,j=col-1;i>=0 && j>=0; j--,i--) {
        //     if(board[i][j] == 'Q') return false;
        // }

        // //diagonal right
        // for(int i=row-1,j=col+1;i>=0 && j<=board[0].length-1;i--,j++) {
        //     if(board[i][j] == 'Q') return false;
        // }

        return true;
    }
    public static void printArr(char arr[][]) {
        System.out.println("---------- chess board ----------");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 3;

        char board[][] = new char[n][n];

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                board[i][j] = '-';
            }
        }

        printArr(board);

        nKnights(board, 0);

        System.out.println("Total ways : "+count);


    }
} 