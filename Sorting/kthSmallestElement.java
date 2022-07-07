public class kthSmallestElement{
    static int lomuto(int arr[] , int l, int r ){
        int i = -1;
        int pivot = arr[r];
        for(int j = 0 ; j<r ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }
    static int quickSelect(int arr[] , int k){    
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int p = lomuto(arr,l,r);
            if(p==k-1){
                return p;
            }
            if(p<k-1){
                l = p+1;
            }else{
                r = p-1;
            }

        }    
        return -1;
    
    }
    public static void main(String args[]){
        int arr[] = {30,20,5,10,8};
        int k = 4;
        System.out.println(arr[quickSelect(arr, k)]);
        

    }
}