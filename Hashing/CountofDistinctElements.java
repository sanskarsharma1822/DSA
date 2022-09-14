import java.util.Arrays;
import java.util.HashSet;

public class CountofDistinctElements {
    public static void main(String args[]){
        Integer arr[] = {10,10,10,14};
        HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));
        // for(int i : arr){
        //     h.add(i);
        // }
        System.out.println("Number of distinct elements is : "+ h.size() );
    }
}
