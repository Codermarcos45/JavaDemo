
import java.util.Scanner;

public class binarySearch {
    
    public static int binarySearchh(int arr[],int key) {
        int sIdx = 0;
        int eIdx = arr.length-1;

        while(sIdx < eIdx) {
            int mid = sIdx + (eIdx-sIdx);

            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                sIdx = mid + 1;
            } else {
                eIdx = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2,4,6,8,9};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number that you want to find :> ");
        int key = sc.nextInt();

        System.out.println("The key "+key+" found at index : "+binarySearchh(arr,key));
    }
}
