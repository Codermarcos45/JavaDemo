//Time Complexity : O(n^2)
package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        //bubble sort
        for(int i=0;i<arr.length-1;i++) {       //n-1
                for(int j=0;j<arr.length-i-1;j++) {     //(n-1),(n-2),(n-3)....
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printElements(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        bubbleSort(arr);
        printElements(arr);
    }
    
}
