public class leftRotateArrayByOne{

    static void  leftShift(int arr[]){
        int start = arr[0];
        for(int i = 0; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = start;
        System.out.println("Array after rotation : ");
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args []){
        // int arr[] = {1,2,3,4,5};
        int arr[] = {30,5,20};
        System.out.println("Array before rotation : ");
        for(int i = 0;i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        leftShift(arr);
    }
}