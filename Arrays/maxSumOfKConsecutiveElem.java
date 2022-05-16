public class maxSumOfKConsecutiveElem {
    static int slide(int arr[] ,int k){
        int window_sum = 0;
        for(int i = 0; i<k ;i++){
            window_sum += arr[i];
        }
        int maxSum = window_sum;
        for(int i = k ; i<arr.length ; i++){
            window_sum +=(arr[i] - arr[i-k]);
            maxSum = Math.max(window_sum, maxSum);
        }
        return maxSum;
    }
    public static void main(String a[]){
        int arr[] = {1,8,30,-5,20,7};
        int k = 3;
        System.out.println("Maximum sum of "+k+" consecutive elements is : "+slide(arr,k));
    }

}
