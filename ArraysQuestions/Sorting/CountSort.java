package Sorting;
//Count sort is very optimized sorting but it depends on the range of numbers.
//When the range of numbers is very small then it very optimized but for big range of numbers it not so much good.
//Time complexity : O(n + range of numbers)


public class CountSort {

    public static void countingSort(int arr[]) {
        //calculate range of the numbers
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            largest = Math.max(largest, arr[i]);
        }

        //create counting array
        int count[] = new int[largest+1];

        //store the frequency of the elements into the counting array
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }

        //sort the original array
        int j = 0;
        for(int i=0;i<count.length;i++) {
            while(count[i] > 0 ) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printElements(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,4,8,7,6};
        countingSort(arr);
        printElements(arr);

    }
    
}
