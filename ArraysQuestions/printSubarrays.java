package JavaDemo.ArraysQuestions;
//print all subarrays, print total number of subarrays, print total sum of the subarrys
//print the maximum sum & minimum sum

public class printSubarrays {

    public static void printSubarray(int arr[]) {

        int tS = 0;
        int tSum = 0;
        int min = 0;
        int max = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++,tS++) {
                System.out.print("[ ");
                max = 0;
                min = 0;
                for(int k=i;k<=j;k++) {
                    System.out.print(arr[k]+" ");
                    tSum += arr[k];
                    max = max + arr[k];
                    min = min + arr[k];
                }
                System.out.print(" ]");
                maxSum = Math.max(maxSum, max);
                minSum = Math.min(minSum,min);
            }
            System.out.println();
            System.out.println("------------------------------ :>:>:>");
        }

        System.out.println("Total subarrays : "+tS);
        System.out.println("Total sum : "+tSum);
        System.out.println("MaxSum : "+maxSum);
        System.out.println("MinSum : "+minSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-4,-6,-8};
        printSubarray(arr);


    }
}