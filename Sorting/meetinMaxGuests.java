import java.util.Arrays;

public class meetinMaxGuests {
    static int max(int arr[] , int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int m = 0;
        int n = 0;
        int maxTogether = 0;
        int curr = 0;
        while(m<arr.length && n<dep.length){
            if(arr[m]<dep[n]){
                curr++;
                m++;
            }else{
                curr--;
                n++;
            }
            maxTogether = Math.max(maxTogether, curr);
        }
        return maxTogether;
    }
    public static void main(String args[]){
        int arrival[] = {900,600,700};
        int dep[] = {1000,800,730};
        System.out.print(max(arrival , dep));

    }
}
