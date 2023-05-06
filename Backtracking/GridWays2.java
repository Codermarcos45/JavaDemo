/*
 Grid Ways : 
 By using Math's Permutation & combination.
 Formula : (n-1+m-1)! / (n-1)! * (m-1)!
 Time complexity : O(n+m)
 */
package Backtracking;

public class GridWays2 {
    public static int factorial(int n) {
        if(n==0) return 1;

        return n * factorial(n-1);
    }
    public static int countWays(int row,int col) {
        int ways = factorial(row-1+col-1) / (factorial(row-1) * factorial(col-1));

        return ways;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        
        System.out.println("Total grid ways : "+countWays(row, col));

    }
}
