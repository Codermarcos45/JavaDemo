//Time complexity : O(n^2)
package Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]) {

        for(int i=1;i<arr.length;i++) {
            int current = arr[i];
            int j = i-1;

            while(j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            //placement 
            arr[j+1] = current;
        }
    }    

    public static void printElements(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5,4,3,1,2};
        printElements(arr);
        insertionSort(arr);
        printElements(arr);
        
    }
}

