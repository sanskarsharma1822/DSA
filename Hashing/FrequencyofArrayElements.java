import java.util.HashMap;
import java.util.Map;

public class FrequencyofArrayElements {
    public static void main(String args[]){
        Integer arr[] = {10,12,10,15,10,20,12,12};
        HashMap<Integer, Integer> h  = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i] , h.get(arr[i])+1);
            }else{
                h.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());
        }
    }
}
