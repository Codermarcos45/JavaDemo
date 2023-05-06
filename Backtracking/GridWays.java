/*
 Find number of ways to reach from (0,0) to (N-1,M-1) in a NxM Grid.
 Allowed moves - right or down.

 ***This problem is same as Maze path problem.
 Time complexity : O(2^n+m)

 This problem has a optimized solution by using Math's Permutation.
 */
package Backtracking;



public class GridWays {
    public static int countGridWays(int row, int col) {
        if(row == 1 && col == 1) return 1;       //base case (condition for last cell)
        if(row < 0 || col < 0) return 0;        //boundary cross condition

        return countGridWays(row, col-1) + countGridWays(row-1, col);
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 4;

        System.out.println("Total ways : "+countGridWays(row, col));

    }
    
}
