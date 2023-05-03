/*
 Merge Sort : (Divide & Conquer, Depth First Search Technique)
 Time Complexity : O(n log n);
 */

package Recursion.DivideNConquer;

public class MergeSort {
    public static void mergeSort(int arr[],int sI, int eI) {
        if(sI >= eI) return;

        int mid = sI + (eI-sI)/2;

        //call for left part to sort
        mergeSort(arr, sI, mid);
        //call for right part to sort
        mergeSort(arr, mid+1, eI);

        //for merging
        merge(arr,mid,sI,eI);
    }

    public static void merge(int arr[], int mid, int sI, int eI) {
        int temp[] = new int[eI-sI+1];
        int i = sI, j = mid+1, k = 0;

        while(i<=mid && j<= eI) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //left part
        while(i<=mid) temp[k++] = arr[i++];
        //right part
        while(j<=eI) temp[k++] = arr[j++];

        //copying temporary to original array
        for(k=0, i=sI; k<temp.length;i++,k++) {
            arr[i] = temp[k];
        }
    }
    
    public static void printElements(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,2,10,4,4,5,-2};
        mergeSort(arr, 0, arr.length-1);
        printElements(arr);
    }
    
}
