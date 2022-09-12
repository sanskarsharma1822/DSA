public class snakePattern {
    static void snake(int arr[][]){
        boolean reverse = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(reverse == true){
                for(int j = arr[i].length-1 ; j>=0 ; j--){
                    System.out.print(arr[i][j] + " ");
                }
                reverse = false;
            }else{
                for(int j = 0 ; j<arr[i].length ; j++){
                    System.out.print(arr[i][j] + " ");
                }
                reverse = true;
            }
        }
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6,7,8},{9,10,11,12}};
        snake(arr);
    }
}
