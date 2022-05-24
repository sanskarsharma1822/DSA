public class findPairWithGivenSum {
    static boolean search(int arr[] , int x){
        int start = 0 ;
        int end = arr.length - 1;
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum==x){
                return true;
            }
            else if(sum<x){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {2,4,8,9,11,12,20,30};
        int x = 24;
        System.out.println("Sum found in array : "+search(arr,x));
    }
}
