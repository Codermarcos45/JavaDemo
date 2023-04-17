package ArraysQuestions;
//Pairs in an array
/*
 arr[] = {1,2,3,4}
 (1,2), (1,3), (1,4)
 (2,3), (2,4)
 (3,4)
 */

public class PairInAnArray {
    
    public static void pairArray(int arr[]) {

        for(int j=0;j<arr.length;j++) {
            for(int i=j+1;i<arr.length;i++) {
                System.out.print("("+arr[j]+", "+arr[i]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        pairArray(arr);


    }
}
