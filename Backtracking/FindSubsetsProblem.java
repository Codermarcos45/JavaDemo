/*
 Find & print all subsets of a given string.
 Given string : "abc"
 Output : "a","b","c","ab","bc","ac","abc", ""(empty set) 

 Time complexity : O(n * 2^n)
 Space complexity : O(n)
 */
package Backtracking;

public class FindSubsetsProblem {
    public static void printAllSubsets(int i, String str, String newStr) {
        //base case
        if(i==str.length()) {
            if(newStr.length() == 0) System.out.println("Null");
            else System.out.println(newStr);
            return;
        }

        //Yes choice
        printAllSubsets(i+1, str, newStr+str.charAt(i));
        //No choice
        printAllSubsets(i+1, str, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        printAllSubsets(0, str, "");
    }
    
}
