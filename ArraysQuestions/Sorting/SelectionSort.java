//Time Complexity : O(n^2)
package Sorting;

public class SelectionSort {
        public static void selectionSort(int arr[]) {
            int smallest;

            for(int i=0;i<arr.length-1;i++) {
                smallest = i;

                for(int j=i+1;j<arr.length;j++) {
                    if(arr[smallest] > arr[j]) {
                        smallest = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }

        public static void printElements(int arr[]) {
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
        }

        public static void main(String[] args) {
            int arr[] = {7,8,3,1,2,9};
            selectionSort(arr);
            
             printElements(arr);
        }
}
