package Sorting;
import java.util.Arrays;
import java.util.Collections;



public class InBuiltSorting {
    
    public static void printElements(Integer arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {3,2,4,1,5};

        //before sorting
        printElements(arr);
        //after normal (ascending) sorting
        Arrays.sort(arr);
        printElements(arr);

        //after reverse sorting (descending)
        Arrays.sort(arr, Collections.reverseOrder());   //it works with Integer data type
        printElements(arr);

    }
}
