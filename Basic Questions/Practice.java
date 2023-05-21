public class Practice {
    public static void mergeSort(int arr[],int sI,int eI) {
        if(sI >= eI) {
            return;
        }

        int mid = sI+(eI-sI)/2;

        mergeSort(arr, sI, mid);
        mergeSort(arr, mid+1, eI);

        merger(arr,sI,eI,mid);
    }

    public static void merger(int arr[],int sI,int eI,int mid) {
        int temp[] = new int[eI-sI+1];
        int i = sI;
        int j = mid+1;
        int k = 0;

        while(i<= mid && j<=eI) {

            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid) {
            temp[k++] = arr[i++];
        }

        while(j<=eI) {
            temp[k++] = arr[j++];
        }

        for(i=sI,k=0;k<temp.length;k++,i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,1};

        printArr(arr);
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}