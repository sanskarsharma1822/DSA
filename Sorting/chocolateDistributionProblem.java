import java.util.*;

public class chocolateDistributionProblem {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(9);
        arr.add(12);
        arr.add(56);
        int m = 3;
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< arr.size()-m ; i++){
            int curr = arr.get(m+i-1) - arr.get(i);
            if(curr<min){
                min = curr;
            }
        }
        System.out.println(min);
    }
}
