import java.util.HashMap;

public class LongestSubArrayWIthSameZerosAndOnes {
    static int longest(int arr[]){
        int res = 0 ;
        HashMap<Integer , Integer> h = new HashMap<>();
        int prefixSum=0;
        for(int i = 0 ; i<arr.length ; i++){
            prefixSum+= arr[i] == 0 ? -1 : 1;
            if(prefixSum == 0){
                res = i+1;
            }
            if(!h.containsKey(prefixSum)){
                h.put(prefixSum , i);
            }
            if(h.containsKey(prefixSum)){
                res = Math.max(res, i-h.get(prefixSum));
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {1,0,1,1,1,0,0};
        System.out.println(longest(arr));
    }
}
