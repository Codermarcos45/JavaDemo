import javax.swing.text.MaskFormatter;

class Practice {
    public static void Kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<arr.length;i++) {
             currSum += arr[i];

             if(currSum < 0) {
                currSum = 0;
             }

             maxSum = Math.max(currSum,maxSum);
        }

        System.out.println("Kadane's algo : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,30,4};


        Kadanes(arr);


    }
}