import java.util.HashSet;
import java.util.Arrays;

public class PairWithGivenSum {
    public static void main(String arg[]){
        Integer arr[] = {10,-3,2,15,21,45};
        HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));
        int sum = 13;
        boolean exist = false;
        for(Integer x : arr){
            if(h.contains(sum-x)){
                System.out.println("Exists");
                exist = true;
                break;
            }
        }
        if(!exist){
            System.out.println("Doesn't exist");
        }

    }
}
