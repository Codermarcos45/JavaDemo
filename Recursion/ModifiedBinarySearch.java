package Recursion;

public class ModifiedBinarySearch {
    public static int search(int arr[],int tar, int sI,int eI) {
        if(sI > eI) return -1;

        int mid = sI + (eI-sI)/2;

        if(arr[mid] == tar) return mid;

        if(arr[sI] <= arr[mid]) {
            if(arr[sI] <= tar && tar <= arr[mid]) return search(arr, tar, sI, mid-1);
            else return search(arr, tar, mid+1, eI);
        }
        else {
            if(arr[mid+1] <= tar && tar <= arr[eI]) return search(arr, tar, mid+1, eI);
            else return search(arr, tar, sI, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,0,1,2,3};
        System.out.println("Target index : "+search(arr, 0, 0, arr.length-1));
    }
    
}
