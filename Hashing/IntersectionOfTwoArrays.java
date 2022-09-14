import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String args[]){
        Integer arr1[] = {20,30};
        Integer arr2[] = {10,20};
        HashSet<Integer> h1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> h2 = new HashSet<>(Arrays.asList(arr2));
        int count = 0;
        for (Integer x : h1){
            if(h2.contains(x)){
                count++;
            }
        }
        System.out.println(count);

    }
}
