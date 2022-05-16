public class maxSumSubArray {
    static int sum(int arr[]){
        int maxSum = arr[0];
        int prevMax = arr[0];
        for(int i = 1; i<arr.length;i++){
            prevMax = Math.max(arr[i],prevMax+arr[i]);
            maxSum = Math.max(prevMax,maxSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        // int arr[] = {-5,1,-2,3,-1,2,-2};
        int arr[] = {1,-2,3,-1,2};
        System.out.println("Max sum of sub array is : "+sum(arr));
    }
}
