public class implementBinarySearch{
    static int normal(int arr[] , int x){
        int start = 0 ;
        int end = arr.length - 1;
        while(start<=end){
            int curr_index = (start+end)/2;
            if(arr[curr_index] == x ){
                return curr_index;
            }
            else if(arr[curr_index] < x){
                start = curr_index+1;
            }
            else{
                end = curr_index-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70};
        System.out.println("Normal Loop , index of 50 : "+normal(arr,50)+", 25 : "+normal(arr,25)+", 70 :"+normal(arr,70));
    }
}