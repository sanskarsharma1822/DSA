public class maximumSumCircularSubArray {
    static int kadane(int arr[]){
        int curr_highest = arr[0];
        int max_highest = arr[0];
        for(int i = 1; i<arr.length ; i++){
            curr_highest = Math.max(curr_highest+arr[i],arr[i]);
            max_highest = Math.max(curr_highest,max_highest);
        }
        return max_highest;
    }
    static int sum(int arr[]){
        int max_normal = kadane(arr);
        
        if(max_normal<0){
            return max_normal;
        }
        int arr_sum = 0;
        int max_circular = 0 ;
        for(int i=0;i<arr.length;i++){
            arr_sum+= arr[i];
            arr[i] = -arr[i];
        }
        int maxSumofInverse = kadane(arr);
        max_circular = arr_sum + maxSumofInverse;
        return Math.max(max_normal, max_circular);
    }
    
    public static void main(String args[]){
        int arr[] = {5,-2,3,4};
        System.out.println("Maximum Sum of Circular Sub Array : "+sum(arr));
    }
}
