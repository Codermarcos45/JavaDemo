/*
 Container with Most Water : 
 For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.
 height[] = =[1,8,6,2,5,4,8,3,7];
 Time complexity : O(n)
 */

package ArrayLists;
import java.util.*;

public class ContainerWithMostWaterProblem {


    //Brute Force Apporach -> O(n^2)
    public static int water(ArrayList<Integer> height) {
        int maxWater = 0;
        int crWater = 0;

        for(int i=0;i<height.size();i++) {
            crWater = 0;
            for(int j=i+1;j<height.size();j++) {
                crWater  = Math.min(height.get(i), height.get(j)) * (j-i);
                maxWater = Math.max(maxWater,crWater);
            }
        }
        return maxWater;
    }

    //Optimized approach -> O(n)
    public static int storedWater(ArrayList<Integer> height) {
        int leftPointer = 0;
        int rightPointer = height.size()-1;
        int water = 0;

        while( leftPointer < rightPointer) {
            int crWater = Math.min(height.get(leftPointer), height.get(rightPointer)) * (rightPointer-leftPointer);
            water = Math.max(water,crWater);

            if(height.get(leftPointer) < height.get(rightPointer)) 
                leftPointer++;
            else 
                rightPointer--;
        }

        return water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(15);
        height.add(15);
        height.add(15);
        height.add(15);
        height.add(15);
        height.add(15);
        height.add(15);
        height.add(15);
        height.add(15);
        height.add(15);

        System.out.println(water(height));
        System.out.println(storedWater(height));
    }

}
