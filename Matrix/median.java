import java.util.Arrays;

public class median {
    static int find(int arr[][]){
        for(int i = 0 ; i <arr.length ; i++){
            Arrays.sort(arr[i]);
        }

        int min = arr[0][0];
        int max = arr[0][arr[0].length-1];
        for(int i = 0 ; i<arr.length ; i++){
            min = Math.min(min , arr[i][0]);
            max = Math.max(max , arr[i][arr[0].length-1]);
        }

        int medianPos = (arr.length * arr[0].length + 1 )/ 2;
        while(min < max ){
            int mid = (min+max)/2;
            int mp = 0;
            for(int i = 0 ; i<arr.length; i++){
                int pos = Arrays.binarySearch(arr[i], mid) + 1;
                mp += Math.abs(pos);

            }
            if(mp < medianPos){
                min = mid+1;
            }else{
                max = mid;
            }
        }
        return max;

    }
    public static void main(String args[]){
        int arr[][] = {{10,21,34,22,16},{7,8,6,20,35},{17,27,37,47,32}};
        System.out.println(find(arr));
    }
}
