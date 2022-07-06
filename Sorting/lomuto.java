public class lomuto {
    static void part(int arr[],int left , int right){
        int pivot = arr[right];
        int i = left-1;
        for(int j = left ; j<right; j++ ){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        System.out.println(i+1);
        for(int j=0; j <arr.length ; j++){
            System.out.print(arr[j] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,13,6,9,12,11,10};
        part(arr,0,arr.length-1);
    }
}
