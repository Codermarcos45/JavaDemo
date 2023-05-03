public class Practice {
    public static int sortedSearch(int arr[],int sI,int eI,int tar) {
        if(sI>eI) return -1;

        int mid = sI + (eI-sI)/2;

        if(arr[mid] == tar) return mid;

        if(arr[sI] <= arr[mid] && arr[mid] <= arr[eI]) {
            
            if(arr[sI] <= tar && tar <= arr[mid-1]) {
                return sortedSearch(arr, sI, mid-1, tar);
            } else {
                return sortedSearch(arr, mid+1, eI, tar);
            }
        } else {
            if(arr[mid+1] <= tar && tar <= arr[eI]) {
                return sortedSearch(arr, mid+1, eI, tar);
            } else {
                return sortedSearch(arr, sI, mid-1, tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int tar = 4;

        System.out.println("Index : "+sortedSearch(arr, 0, arr.length-1, tar));

    }
}