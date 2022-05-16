public class moveZerosToEnd {

    static void moveZeroes(int arr[]){
        int low = 0;
        int high = arr.length -1 ;
        while(low<high){
            if(arr[high]==0){
                high--;
            }
            else if(arr[low] == 0 ){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
                low++;
            }
            else{
                low++;
            }
        }

        System.out.println("Array after wrong swapping is : ");
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    static void moveZeroesCorrect(int arr[]){
        int count = 0;
        for(int i =0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] !=0){
                int temp = arr[i];
                // System.out.println("temp : "+temp);
                arr[i] = arr[count];
                // System.out.println("arr[i] after swap : "+arr[i]);
                arr[count] = temp;
                // System.out.println("arr[count after swap] : "+arr[count]);
                count+=1;
                System.out.println("count : "+count);
            }
        }

        System.out.println("Correct one is :");
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // int arr[] = {0,10,20,0,12,14,0,15,66,0};
        int arr[] = {10,5,0,0,8,0,9,0};
      
        System.out.println("Original Array : ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // moveZeroes(arr);
        moveZeroesCorrect(arr);
    }
}
