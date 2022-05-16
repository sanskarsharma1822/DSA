public class prefixSum {
    static boolean equi(int arr[]){
        int arr_sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            arr_sum += arr[i];            
        }
        int leftSum = 0;
        for(int i = 0; i<arr.length ; i++){
            if(leftSum == arr_sum - arr[i]){
                return true;
            }
            leftSum += arr[i];
            arr_sum -= arr[i];
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]  =  {4,2,-2};
        System.out.println(equi(arr));

    }
}
