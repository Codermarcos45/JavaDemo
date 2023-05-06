/*
 Find & print all permutations of a String.
 Given string : "abc"
 Output : "abc", "acb", "bac", "bca", "cab", "cba"
 
 If a string have n elements then it can have maximum n factorial(!n) permutations.
 Time complexity : O(n * (n!))

 */
package Backtracking;

public class FindAllPermutations {
    static int count = 1;
    public static void printPermutations(String str, String ans) {
        //base case
        if(str.length() == 0) {
            System.out.println(count+++" no : "+ans);
            return;
        }

        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            //"abcde" (remove c) => "ab" + "de"
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newStr, ans+currChar);
        }


    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
