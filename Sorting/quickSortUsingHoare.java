public class quickSortUsingHoare {
    static int hoare(int arr[] , int l , int r){
        int pivot = arr[l];
        int i = l-1;
        int j = r+1;
        while(true){
            do{
                i++;
            }while(arr[i] < pivot );
            do{
                j--;
            }while(arr[j] > pivot);
            if(i>=j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void quickSort(int arr[] , int l , int r){
        if(l<r){
            int p = hoare(arr,l,r);
            quickSort(arr,l,p);
            quickSort(arr,p+1,r);
        }
    }
    static void solve(int arr[]){
        quickSort(arr,0,arr.length-1);
    }
    public static void main(String a[]){
        int arr[] = {8,4,7,9,3,10,5};
        solve(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
