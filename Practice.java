package JavaDemo;
class Practice {

    public static void printSubarrays(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                currSum = 0;
                for(int k=i;k<=j;k++) {
                    currSum += arr[k];
                }
                System.out.println("Current sum = "+currSum);
                maxSum = Math.max(maxSum,currSum);
            }
        }

        System.out.println("Max SubArray Sum  = "+maxSum);


    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        printSubarrays(arr);


    }
}