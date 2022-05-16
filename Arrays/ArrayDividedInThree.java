public class ArrayDividedInThree {
    static void pair(int arr[]){
        int arr_sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            arr_sum += arr[i];
        }
        if(arr_sum%3!=0){
            System.out.println("Not possible");
        }
        else{
            int preSum = 0 ;
            for(int i = 0 ;i <arr.length ; i++){
                preSum += arr[i];
                if(preSum == arr_sum/3 || preSum == 2*(arr_sum/3)){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {5,2,6,1,1,1,5};
        pair(arr);
    }
}
