import java.util.HashMap;
public class LongestSubArrayWithGivenSum {
   static int longest(int arr[], int sum){
    int prefixSum = 0 ;
    int res =0 ;
    HashMap<Integer,Integer> h = new HashMap<>();
    for (int i = 0 ; i<arr.length ; i++){
        prefixSum += arr[i] ;
        if(prefixSum == sum){
            res = i+1;
        }
        if(!h.containsKey(prefixSum)){
            h.put(prefixSum , i);
        }
        if(h.containsKey(prefixSum-sum)){
            res = Math.max(res, i - h.get(prefixSum-sum));
        }
    }
    return res;
   }
   public static void main(String args[]){
    int arr[] = {8,3,1, 5,-6,6,2,2};
    int sum = 4;
    System.out.println(longest(arr,sum));
   } 
}
