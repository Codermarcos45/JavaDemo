/*
 Tiling Problem :
 Given a "2xn" board and tiles of size "2x1", count the number of ways to tile the given 
 board using the 2x1 tiles.
 (A tile can either be placed horizontally or verticcally.)
 Time complexity : 
 */
package Recursion;

import javax.management.relation.RoleResult;

public class TilingProblem {
    public static int tilingWays(int n) {
        //base case 
        if(n==0 || n==1) return 1;

        return tilingWays(n-1) + tilingWays(n-2);
    }
    public static void main(String[] args) {
        
        System.out.println(tilingWays(3));

    }
}
