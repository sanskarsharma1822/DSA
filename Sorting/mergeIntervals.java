import java.util.*;
class Interval implements Comparable<Interval>{
    int start,end;
    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }
    public int compareTo(Interval i){
        return this.start - i.start;
    }
}

public class mergeIntervals {
    public static void main(String args[]){
        Interval arr[] = {new Interval(5,10) , new Interval(3,15) , new Interval(18,30) , new Interval(2,7)};
        Arrays.sort(arr);
        merge(arr);
    }

    static void merge(Interval arr[]){
        int res = 0;
        for(int j = 1; j<arr.length ; j++){
            if(arr[res].end >= arr[j].start){
                arr[res].start = Math.min(arr[res].start , arr[j].start);
                arr[res].end = Math.max(arr[res].end , arr[j].end);
            }else{
                res++;
                Interval temp = arr[res];
                arr[res] = arr[j];
                arr[j] = temp;
            }
        }

        for(int i= 0 ; i<=res ; i++){
            System.out.print("["+arr[i].start + "," + arr[i].end +"]" +" ");
        }
    }

}
