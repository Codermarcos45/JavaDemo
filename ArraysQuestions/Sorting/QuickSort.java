/*
 Quick Sort : 
 Time complexity : O(n^2) [average case : nlogn]
 Space complexity : O(1)

 Worst Case of Quick Sort :
 In quick sort, worst case occurs when the pivot is the smallest or largest element.
 (important question Shradha Didi interview)
 */

 package Sorting;

public class QuickSort {

    public static void quickSortt(int arr[], int sI,int eI) {
        if(sI >= eI) return;

        int pivotIndex = partition(arr, sI, eI);  //partition() gives the index of the pivot
        quickSortt(arr, sI, pivotIndex-1);   //left part of pivot
        quickSortt(arr, pivotIndex+1, eI);   //right part of pivot
    }

    //partition function is the most important in the quick sort
    public static int partition(int arr[], int sI, int eI) {
        int pivot = arr[eI];
        int i = sI-1;

        for(int j=sI;j<eI;j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[eI] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printElements(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        printElements(arr);
        quickSortt(arr, 0, arr.length-1);
        printElements(arr);

    }
    
}
