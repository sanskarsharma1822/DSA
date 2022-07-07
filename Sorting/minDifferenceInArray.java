import java.util.*;

public class minDifferenceInArray {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(3);
        arr.add(20);
        arr.add(12);
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i<arr.size(); i++){
            int curr = Math.abs(arr.get(i) - arr.get(i-1));
            if( curr < min){
                min = curr;
            }
        }
        System.out.println(min);

    }
}
