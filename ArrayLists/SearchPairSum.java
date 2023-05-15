/*
 Find PairSum : 
 Find if any pair in a sorted Arraylist has a target sum.
 Optimized approach : Left & Right pointer approach
 Time Complexity : O(n)
 */

package ArrayLists;
import java.util.ArrayList;

public class SearchPairSum {

    //Time Complexity : O(n^2)
    public static void bruteForce(ArrayList<Integer> list, int targetSum) {

        for(int i=0;i<list.size();i++) {
            for(int j=i+1;j<list.size();j++) {
                if((list.get(i)+list.get(j)) == targetSum)
                    System.out.print(" ( "+list.get(i)+","+list.get(j)+" ) ");
            }
            System.out.println();
        }
    }

    public static void pairSum(ArrayList<Integer> list,int targetSum) {
        int i = 0;
        int j = list.size()-1;

        while (i < j) {
            if(list.get(i) + list.get(j) == targetSum) {
                System.out.print(" ( "+list.get(i)+","+list.get(j)+" ) ");
                // return;

            } 
            
            if((list.get(i) + list.get(j)) < targetSum) {
                i++;
            }else {
                j--;
            }
            
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int targetSum = 5;

        System.out.println("Brute Force Approach : ");
        bruteForce(list, targetSum);
        System.out.println("Optimized Pointer Approach : ");
        pairSum(list, targetSum);


    }
    
}
