public class mergeSort {
    static void merge(int arr[] , int l,int r){
        if(r>l){
            int mid = l + (r-l)/2;
            merge(arr,l,mid);
            merge(arr,mid+1,r);
            mergeFunction(arr,l,mid,r);
        }
    }
    static void mergeFunction(int arr[] , int l, int m, int r){
        int leftLen = m-l+1;
        int rightLen = r-m;
        int left[] = new int[leftLen];
        int right[] = new int[rightLen];
        for(int i = 0 ; i<leftLen; i++){
            left[i] = arr[l+i];
        }
        for(int i = 0 ; i<rightLen ; i++){
            right[i] = arr[m+i+1];
        }
        int x=0;
        int y=0;
        int k=l;
        while(x<left.length && y<right.length){
            if(left[x]<=right[y]){
                arr[k] = left[x];
                x++;
            }else{
                arr[k] = right[y];
                y++;
            }
            k++;
        }

        while(x<left.length){
            arr[k] = left[x];
            x++;k++;
        }
        while(y<right.length){
            arr[k] = right[y];
            y++;k++;
        }
    }
   public static void main(String args[]){
    int arr[] = {5,10,30,15,7};
    merge(arr,0,4);
    for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
   } 
}



