/*
 In the below we have 2 function :
 1st function takes 4 parameters & 2nd function takes only 2 parameters but there's no major difference in the logic.
 Each function performs same task with almost same time complexity. 
 */
package Recursion;

 import java.util.Scanner;

 public class CountMazePath {
     // Function 1 : it takes 4 parameters but same as below function
     public static int mazePath(int currRow,int currCol, int endRow, int endCol) {
         int rightWays = 0;
         int downWays = 0;
 
         if(currRow == endRow && currCol == endCol) return 1;
         
         //only rightways call
         if(currRow == endRow)  rightWays += mazePath(currRow, currCol+1, endRow, endCol);
         //only downways call
         if(currCol == endCol) downWays += mazePath(currRow+1, currCol, endRow, endCol);
 
         if(currRow < endRow && currCol < endCol) {
             //downways call
             downWays += mazePath(currRow+1, currCol, endRow, endCol);
             //rightways call
             rightWays += mazePath(currRow, currCol+1, endRow, endCol);
         }
         
         return downWays + rightWays;
     }
 
     // Function 2 : it takes 2 parameters but same as above function
     public static int maze(int row, int col) {
 
         int rightWays = 0;
         int downWays = 0;
 
         if(row == 1 && col == 1) return 1;
 
         //CASE 1 : only rightways call because can't go down
         if(row == 1) rightWays += maze(row, col-1);
         //CASE 2 : only downways call because can't go right
         if(col == 1) downWays += maze(row-1, col);
 
         if(row > 1 && col > 1) {
             rightWays += maze(row, col-1);
             downWays += maze(row-1, col);
         }
         
         return rightWays + downWays;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.println("Enter the number of rows of the maze path : ");
         int endRow = sc.nextInt();
         System.out.println("Enter the number of columns of the maze path : ");
         int endCol = sc.nextInt();
 
         System.out.println("Total number of ways : "+mazePath(1, 1, endRow, endCol));
         System.out.println("Maze path function(2) result : "+maze(endRow, endCol));
     }
     
 }
 