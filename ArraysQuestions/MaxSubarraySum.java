package JavaDemo.ArraysQuestions;
//This is an Brute Force Approach
//It's alternative & optimized approach is "Prefix Sum"

public class MaxSubarraySum {
    
    public static int maxSubArraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                currSum = 0;
                for(int k=i;k<=j;k++) {
                    currSum += arr[k];
                }
                maxSum = Math.max(maxSum,currSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        System.out.println("The maximum subarray sum is : "+maxSubArraySum(arr));
    }
}
