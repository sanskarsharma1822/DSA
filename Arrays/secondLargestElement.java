public class secondLargestElement {
    static int secondLargest(int arr[]){
        int largest = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[largest] < arr[i]){
                largest = i;
            }
        }
        int second = -1;
        for(int i =0;i<arr.length;i++){
           if(arr[i] != arr[largest]){
               if(second==-1||arr[i] > arr[second]){
                   second = i;
               }
           }
        }        
        return second;
    }


    static int better(int [] arr){
        int largest = 0;
        int second = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                second = largest;
                largest = i;
            }
            else if(arr[i]<arr[largest]){
                if(second==-1|| arr[i]>arr[second]){
                    second = i;
                }
            }
        }
        return second;
    }
    public static void main(String args[]){
        int [] arr = {20,10,20,12,8};
        // int [] arr = {10,10,10};
        System.out.println("Index of second largest element of array is : " + secondLargest(arr));
        System.out.println("Index of second largest element of array using better method is : "+better(arr));
    }
}
