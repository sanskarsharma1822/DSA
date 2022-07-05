public class mergeFunctionOfMergeSort {
    static void merge(int arr[] , int low , int mid , int high){
        int leftLen = mid-low+1;
        int rightLen = high - mid;
        int left[] = new int[leftLen];
        int right[] = new int[rightLen];
        for(int i = 0 ; i<leftLen ; i++){
            left[i] = arr[low+i];
        }
        for(int i = 0 ; i<rightLen ; i++){
            right[i] = arr[mid+i+1];
        }

        int m = 0;
        int n = 0;
        int k = 0;
        while(m<leftLen && n<rightLen){
            if(left[m] <=right[n]){
                arr[k] = left[m];
                m++;
            }else{
                arr[k] = right[n];
                n++;
            }
            k++;
        }

        while(m<leftLen){
            arr[k] = left[m];
            k++;m++;
        }

        while(n<rightLen){
            arr[k] = right[n];
            k++;n++;
        }

        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,15,20,11,30};
        int low = 0;
        int mid = 2;
        int high = 4;
        merge(arr,low,mid,high);
    }
}
