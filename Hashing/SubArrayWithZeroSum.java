import java.util.HashSet;

public class SubArrayWithZeroSum {
    static boolean exist(int arr[]){
        int prefixSum = 0;
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0 ; i<arr.length ; i++){
            prefixSum += arr[i];
            if(h.contains(prefixSum)){
                return true;
            }
            if(prefixSum==0){
                return true;
            }
            h.add(prefixSum);
        }
        return false;

    }
    public static void main(String args[]){
        // int arr [] = {-3,4,-2,-3,1};
        int arr[] = {-3,2,1,4};
        if(exist(arr)){
            System.out.println("Exists");
        }else{
            System.out.println("Doesn't exist");
        }
    }
}
