public class maxDifference {
    static int max(int arr[]){
        int max = arr[1] - arr[0];
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[j] - arr[i] > max){
                    max = arr[j] - arr[i];
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        // int arr[] = {2,3,10,6,4,8,1};
        // int arr[] = {30,10,8,2};
        int arr[] = {7,9,5,6,3,2};
        System.out.println("Maximum Difference is : " + max(arr));
    }
}
