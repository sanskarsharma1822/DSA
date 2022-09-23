import java.util.HashMap;

public class LongestCommonSpanWithSameSum {
    static int longest(int arr1[] , int arr2[]){
        int res = 0 ;
        int temp [] = new int[arr1.length];
        for(int i = 0 ; i< arr1.length ; i++){
            temp[i] = arr1[i] - arr2[i];
        }
        HashMap<Integer , Integer> h = new HashMap<>();
        int prefixSum = 0;
        for(int i = 0 ; i<temp.length ; i++){
            prefixSum += temp[i];
            if(prefixSum == 0){
                res = i+1;
            }
            if(!h.containsKey(prefixSum)){
                h.put(prefixSum , i);
            }
            if(h.containsKey(prefixSum)){
                res = Math.max(res , i- h.get(prefixSum));
            }
        }
        return res;
    }
    public static void main(String args[]){
        // int arr1[] = {0,1,0,0,0,0};
        // int arr2[] = {1,0,1,0,0,1};
        int arr1[] = {12,15,14,22,7};
        int arr2[] = {32,3,32,16,25};
        System.out.println(longest(arr1, arr2));
    }
}
