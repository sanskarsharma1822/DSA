public class selectionSort {
    static void selection(int arr[]){
        for(int i = 0 ; i <arr.length ; i++){
            int minInd = i;
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[j] < arr[minInd]){
                    minInd = j;
                }
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {10,5,8,20,2,18};
        selection(arr);
    }
}
