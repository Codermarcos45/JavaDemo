/*
 Merge Sort :
 Time complexity : O(nlogn)
 Space complexity : O(n)
 */
package Sorting;

public class MergeSort {
    public static void mergeSorting(int arr[], int sI, int eI) {
        if(sI >= eI) return;

        int mid = sI + (eI-sI)/2;
        mergeSorting(arr, sI, mid);
        mergeSorting(arr, mid+1, eI);

        merge(arr,mid,sI,eI);
    }

    public static void merge(int arr[], int mid, int sI, int eI) {
        int temp[] = new int[eI-sI+1];
        int i = sI, j = mid+1, k = 0;

        while(i<=mid && j<=eI) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid) temp[k++] = arr[i++];
        while(j<=eI) temp[k++] = arr[j++];

        for(k=0,i=sI; k<temp.length; k++, i++) {
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
        int arr[] = {1,9,8,5,3,7,6};
        mergeSorting(arr, 0, arr.length-1);
        printElements(arr);
    }
    
}
