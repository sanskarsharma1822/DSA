public class reverseArray {

    static void reverse(int arr[]){
        for(int i = 0;i<(arr.length)/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println("Array after reverse is : ");
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        System.out.println("Array is : ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        reverse(arr);
    }
}
