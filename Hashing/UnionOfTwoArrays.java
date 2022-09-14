import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main (String args[]){
        int arr1[] = {15,20,5,15};
        int arr2[] = {15,15,15,20,10};
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0 ; i<arr1.length ; i++){
            h.add(arr1[i]);
        } 
        for(int i : arr2){
            h.add(i);
        }

        System.out.println(h.size());
    }
}
