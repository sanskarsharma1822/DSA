public class quickSortUsingLomuto {
    static int lomuto(int arr[], int l, int r){
        int pivot = arr[r];
        int i = -1;
        for(int j = 0 ; j<r ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1] ; 
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }
    static void quickSort(int arr[], int l , int r){
        if(l<r){
            int p = lomuto(arr,l,r);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
        }
    }
    static void solve(int arr[]){
        quickSort(arr,0,arr.length-1);
    }
    public static void main(String args[]){
        int arr[] = {8,4,7,9,3,10,5};
        solve(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
