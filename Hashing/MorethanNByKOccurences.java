import java.util.HashMap;
import java.util.Map;

public class MorethanNByKOccurences {
    static void occ(int arr[] , int k){
        int ratio = arr.length /k;
        HashMap<Integer , Integer> h = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            h.put(arr[i] , h.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> e : h.entrySet()){
            if(e.getValue() >= Math.ceil(ratio)){
                System.out.print(e.getKey() + " ");
            }
        }
    }
    static void moore(int arr[] , int k){
        HashMap<Integer , Integer> h = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i] , h.get(arr[i])+1);
            }
            else{
                if(h.size() == k-1){
                    for(Map.Entry<Integer , Integer> e : h.entrySet()){
                        if(e.getValue()-1==0){
                            h.remove(e.getKey());
                        }else{
                        h.put(e.getKey() , e.getValue()-1);
                        }
                    }
                }
                else{
                    h.put(arr[i] , 1);
                }
            }
        }

        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            int count = 0;
            for(int i = 0 ; i<arr.length ; i++){
                if(arr[i] == e.getKey()){
                    count++;
                }
            }
            if(count > arr.length/k){
                System.out.print(e.getKey() + " ");
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {30,10,20,30,30,40,30,40,30};
        int k = 2;
        occ(arr, k);
        moore(arr,k);
    }
}
