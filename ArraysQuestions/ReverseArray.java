package ArraysQuestions;
public class ReverseArray {
    
    public static void reverseOfAnArray(int arr[]) {
        int len = arr.length;

        for(int i=0;i<(len/2);i++) {
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
        System.out.println("Before reversing ::: >>> ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }

        reverseOfAnArray(arr);
        System.out.println("\nAfter reversing ::: >>> ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
