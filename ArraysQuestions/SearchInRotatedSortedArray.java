/*
  Search in Rotated Sorted Array or Modified Binary Search : 
    input : sorted, rotated array with distinct numbers (in ascending order). 
    It is rotated at a pivot point. Find the index of given element.
    
  Time complexity : O(logn)
 */
public class SearchInRotatedSortedArray {

    public static int search(int arr[],int sI,int eI,int tar) { 
        if(sI > eI) return -1;  //base case

        int mid = sI + (eI-sI)/2;

        //target FOUND at mid -> 
        if(arr[mid] == tar) return mid;

        //mid lies on L1
        if(arr[sI] <= arr[mid]) {
            //CASE 1 : tar lies on left part       
            if(arr[sI] <= tar && tar <= arr[mid]) return search(arr, sI, mid-1, tar);   
            // CASE 2 : tar lies on right part
            else return search(arr, mid+1, eI, tar);    
        }
        //mid lies on L2
        else {    
            //CASE 3 : tar lies on right part
            if(arr[mid+1] <= tar && tar <=arr[eI]) return search(arr, mid+1, eI, tar);
            //CASE 4 : tar lies on left part  
            else return search(arr, sI, mid-1, tar);    
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int tar = 10;

        System.out.println("Target index : "+search(arr, 0, arr.length-1, tar));

    }
}