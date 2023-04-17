//This is an optimized aproach of max subarray sum (more optimized than prefix sum)
//Time complexity : O(n)



public class KadanesAlgorithm {
    
    public static int kadanes(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            currSum += arr[i];

            if(currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum,currSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        
        System.out.println("MAX SUBARRAY SUM : "+kadanes(arr));
    }
    
}
