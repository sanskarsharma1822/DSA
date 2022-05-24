public class findTripletWithGivenSum {
    static boolean search(int arr[] , int x){
        for(int i = 0 ; i<arr.length-1 ; i++){
            int start = i+1;
            int end = arr.length -1;
            int findSum = x - arr[i];
            while(start<end){
                int sum = arr[start] + arr[end];
                if(sum==findSum){
                    return true;
                }
                else if(sum<x){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,8,9,20,40};
        int x = 32;
        System.out.println(search(arr,x));
    }
}
