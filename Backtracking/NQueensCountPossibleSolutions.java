package Backtracking;

public class NQueensCountPossibleSolutions {
    static int count = 0;
    
    public static void nQueens(char board[][],int row) {
        //base case
        if(row == board.length) {
            printBoard(board);
            return;
        }

        for(int i=0;i<board.length;i++) {
            if(isSafe(board,row,i)) {
                board[row][i] = 'Q';
                nQueens(board, row+1);
                board[row][i] = '-';
            }
        }
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
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
    public static void printBoard(char board[][]) {
        System.out.println("Ways : "+(++count)+"-> --------- chess board ----------");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;

        char board[][] = new char[n][n];
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                board[i][j] = '-';
            }
        }

        // printBoard(board);

        System.out.println("<- <- <- <- <- <- Biswarup Singha -> -> -> -> -> -> ");
        nQueens(board, 0);
        System.out.println("<- <- <- <- <- <- Biswarup Singha -> -> -> -> -> -> ");

        


    }
}