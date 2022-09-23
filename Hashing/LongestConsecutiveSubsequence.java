import java.util.*;
public class LongestConsecutiveSubsequence {
    static int longest(int arr[]){
        HashSet<Integer> h = new HashSet<>();
        for(int x : arr){
            h.add(x);
        }
        int res = 0 ;
        for (Integer x : h){
            if(!h.contains(x-1)){
                int len = 1;
                while(h.contains(x+len)){
                    len++;
                }
                res = Math.max(res , len);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,2,9,10,8,6,7,5};
        System.out.println(longest(arr));
    }
}
