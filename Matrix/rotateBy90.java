public class rotateBy90 {
    static void rotate(int arr[][]){

        for(int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j<arr.length ; j++){
                int tem = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tem;
            }
        }

        for(int i = 0 ; i<arr.length ; i++){
            int low = 0 ; 
            int high = arr.length - 1;
            while(low < high){
                int temp = arr[high][i];
                arr[high][i] = arr[low][i];
                arr[low][i] = temp;
                low++;
                high--;
            }
        }

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr.length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(arr);
    }
}
