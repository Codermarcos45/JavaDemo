/*
 At first, fill the array with 1 to n with Recursion.
 Then decrease each elements with (-2) with Recursion.
 Output : 1 2 3 4 5 
 Final output : -1 0 1 2 3
 */
package Backtracking;

    public class BTOnArrays {
        public static void BTArrays(int arr[],int i) {
            //base case
            if(i==arr.length) {
                printElements(arr);
                return;
        }

        //recursive work
        arr[i] = i+1;
        //recursive call
        BTArrays(arr, i+1);
        //backtracking step
        arr[i] = arr[i]-2;
    }

    public static void printElements(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        BTArrays(arr, 0);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }

    }
    
}
