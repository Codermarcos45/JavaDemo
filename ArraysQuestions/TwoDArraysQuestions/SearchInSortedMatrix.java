//This problem is also known as Staircase Searching
//Time complexity : O(n+m)      (Time complexity depends on row or column which is bigger)
package TwoDArraysQuestions;

public class SearchInSortedMatrix {
    public static void stairCaseSearching(int matrix[][],int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i= n-1;
        int j = 0;

        while( i >= 0 && j <= (m-1) ) {
            if(matrix[i][j] == key) {
                System.out.println("The key is found at index ("+i+", "+j+")");
                return;
            } else if(matrix[i][j] < key) {
                j++;
            } else {
                i--;
            }
        }

        System.out.println("Waring!The key is not found <:---:>");
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;

        stairCaseSearching(matrix, key);
        

    }
    
}
