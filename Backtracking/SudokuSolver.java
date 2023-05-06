/*
 Write a function to solve a Sudoku.
 */
package Backtracking;

public class SudokuSolver {
    
    public static boolean sudokuSolverFunction(int sudoku[][],int row,int col) {
        //base case
        if(row == 9) return true;
        

        int nextRow = row, nextCol = col + 1;
        if(col+1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if(sudoku[row][col] != 0) return sudokuSolverFunction(sudoku, nextRow, nextCol);

        for(int digit=1;digit<=9;digit++) {
            if(isSafe(sudoku,row,col,digit)) {
                sudoku[row][col] = digit;
                if(sudokuSolverFunction(sudoku,nextRow,nextCol)) return true;
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int sudoku[][],int row,int col,int digit) {
        
        //condition for column
        for(int i=0;i<=8;i++) {
            if(sudoku[i][col] == digit) return false;
        }

        //condition for row
        for(int i=0;i<=8;i++) {
            if(sudoku[row][i] == digit) return false;
        }

        //condition for grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        //3 x 3 grid 
        for(int i=sr;i<sr+3;i++) {
            for(int j=sc;j<sc+3;j++) {
                if(sudoku[i][j] == digit) return false;
            }
        }

        return true;
    }

    public static void printSudoku(int sudoku[][]) {
        System.out.println("----------: SUDOKU :----------");
        for(int i=0;i<sudoku.length;i++) {
            System.out.println("_________________________________");
            for(int j=0;j<sudoku[0].length;j++) {
                System.out.print(sudoku[i][j]+" | ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}};

            // printSudoku(sudoku);
            sudokuSolverFunction(sudoku, 0, 0);
            printSudoku(sudoku);

    }
}
