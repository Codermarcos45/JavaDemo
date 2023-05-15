/* 
Find PairSum : 
 Find if any pair in a SORTED & ROTATED Arraylist has a target sum.
 Optimized approach : Left & Right pointer approach
 Time Complexity : O(n)
 */
package ArrayLists;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class SearchPairSum2 {
    //My special updation approach -> O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int targetSum) {
        int lp = 0;
        int rp = 0;

        for(int i=0;i<list.size();i++) {
            if(list.get(i) > list.get(i+1)) {
                lp = i + 1;
                rp = i;
                break;
            }
        }

        while(lp != rp) {
            //case 1 
            if((list.get(lp) + list.get(rp)) == targetSum)  {
                System.out.println("Target Sum Found ->  ( "+list.get(lp)+" , "+list.get(rp)+" )");
                return true;
            }

            if((list.get(lp) + list.get(rp))  < targetSum) {     //case 2
                lp++;
                if(lp == list.size()) lp = 0;
            } else {    //case 3
                rp--;
                if(rp == -1) rp = list.size()-1;
            }
        }
        
        return false;
    }
    
    //Modular Arithmetic Approach -> O(n)
    public static boolean pairSum(ArrayList<Integer> list, int targetSum) {
        int lp =0;
        int rp = 0;

        for(int i=0;i<list.size();i++) {
            if(list.get(i) > list.get(i+1)) {   //breaking point
                lp = i+1;
                rp = i;
                break;
            }
        }

        while(lp != rp) {
            //found case
            if(list.get(lp) + list.get(rp) == targetSum) {
                System.out.println("Target Sum Found -> ( "+list.get(lp)+", "+list.get(rp)+") ");
                return true;
            }

            //sum is greater than target
            if(list.get(lp) + list.get(rp) > targetSum) rp = (list.size()+rp-1) % list.size();
            //sum is less than target
            else lp = (lp + 1) % list.size();
        }

        return false;
    }
    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int targetSum = 26;

        
        
        if(pairSum2(list, targetSum) == false) {
            System.out.println("Target not found!");
        } 

        if(pairSum(list, targetSum) == false) {
            System.out.println("Target not found!");
        }

  
    }
}
