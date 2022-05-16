public class maxAppearingElemInRange {
    static int pre(int L[] , int R[]){
        int arr[] = new int[1000];
        for(int i = 0 ; i<L.length ; i++){
            arr[L[i]]++;
            arr[R[i]+1]--;
        }
        int maxSum = arr[0] ; 
        int result = 0;
        int arr_sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            arr_sum += arr[i];
            if(arr_sum>maxSum){
                maxSum = arr_sum ; 
                result= i;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int L[] = {1,2,3};
        int R[] = {3,5,7};
        System.out.println("Maximum occuring element is : "+pre(L,R));
    }
}
