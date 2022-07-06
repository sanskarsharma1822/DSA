public class naivePartitioning {
    static void naive(int arr[] ,int left, int pivotInd , int right){
        int pivot = arr[pivotInd];
        int temp[] = new int[right-left+1];
        int index = 0;
        for(int i = left ; i<=right ; i++){
            if(arr[i] < pivot){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i = left ; i<=right ; i++){
            if(arr[i] == pivot){
                temp[index] = arr[i];
                index++;
            }
        }
        int res = left+index-1;
        for(int i = left; i<=right ; i++){
            if(arr[i]>pivot){
                temp[index] = arr[i];
                index++;
            }
        }
        

        for(int i = left ; i<=right ; i++){
            arr[i] = temp[i-left];
        }
        System.out.println(res);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static void main(String args[]){
        int arr[] = {10,80,30,90,40,50,70};
        naive(arr,0,5,6);
    }
}
