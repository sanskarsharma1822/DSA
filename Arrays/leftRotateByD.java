public class leftRotateByD {
    static void leftShift(int arr[],int d){
        int start[] = new int[d];
        for(int i = 0 ; i<d; i++){
            start[i] = arr[i];
        }
        for(int i = 0; i<arr.length-d; i++){
            arr[i] = arr[i+d];
        }
        for(int i = 0 ;i<d;i++){
            arr[arr.length-d+i] = start[i];
        }

        System.out.println("Array after rotation by "+d+" is :");
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int arr[], int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    static void best(int arr[] , int d){
            reverse(arr, 0, d-1);
            reverse(arr, d, arr.length-1);
            reverse(arr,0, arr.length-1);
            System.out.println("After rotation : ");
            for(int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static void main(String args[]){
        // int arr[] = {1,2,3,4,5};
        int arr[] = {10,5,30,15};
        int d = 3 ;
        System.out.println("Array before rotation :");
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // leftShift(arr,d);

        best(arr,d);
    }
}
