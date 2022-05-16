public class largestElement {
    static int largest(int [] arr){
        int largest = arr[0];
        int largestIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }
    public static void main(String args[]){
        int [] arr = {1,2,13,5,2};
        System.out.println("Index of largest element in array is : "+largest(arr));
    }
}
