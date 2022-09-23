import java.util.HashMap;

public class CountDistinctElementsinEveryWindow {
    static void count(int arr[],int k){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0 ; i<k ; i++){
            h.put(arr[i], h.getOrDefault(arr[i], 0)+1);
        }
        System.out.print(h.size() + " ");
        for(int i = 0 ; i<arr.length-k; i++){
            h.put(arr[i], h.get(arr[i]) -1 );
            if(h.get(arr[i]) == 0){
                h.remove(arr[i]);
            }
            h.put(arr[i+k] , h.getOrDefault(arr[i+k], 0) + 1);
            System.out.print(h.size() + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,10,10,30,40};
        int k = 4;
        count(arr,k);
    }
}
