import java.util.ArrayList;
import java.util.*;

public class bubbleSort {

    static void bubble(int arr[]){
        int max = arr.length;
        while(max>1){
            for(int i = 0 ; i<max-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            max--;
        }
        for(int i= 0 ; i<arr.length ; i++){
            System.out.print(arr[i]  + " ");
        }
    }
    static void optimizedBubble(int arr[]){
        for(int i = 0 ; i<arr.length-1 ; i++){
            boolean swapped = false;
            for(int j = 0 ; j<arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
        for(int i= 0 ; i<arr.length ; i++){
            System.out.print(arr[i]  + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,8,2,7};
        // bubble(arr);
        optimizedBubble(arr);
    }
}
