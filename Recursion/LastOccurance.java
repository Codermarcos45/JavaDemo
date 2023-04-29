package Recursion;

public class LastOccurance {

    public static int lastOccur(int arr[],int i,int key) {
        if(i < 0) return -1;

        if(arr[i] == key) return i;

        return lastOccur(arr, i-1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,2};
        System.out.println(lastOccur(arr, arr.length-1, 2));
    }
    
}
