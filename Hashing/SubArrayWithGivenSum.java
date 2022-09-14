import java.util.HashSet;

public class SubArrayWithGivenSum {
    static boolean exists(int arr[] , int k){
        int prefixSum = 0 ;
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0 ; i<arr.length ; i++){
            prefixSum += arr[i];
            if(h.contains(prefixSum-k)){
                return true;
            }
            if(prefixSum == k){
                return true;
            }
            h.add(prefixSum);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {15,2,8,10,-5,-8,6};
        int sum = 2;
        if(exists(arr,sum)){
            System.out.println("Exists");
        }else{
            System.out.println("Doesn't exist");
        }
    }
}
