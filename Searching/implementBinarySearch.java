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

    static int recursion(int arr[], int x ,int start , int end){
            if(start>end){
                return -1;
            }
            int curr = (start+end)/2;
            if(arr[curr] == x){
                return curr;
            }
            else if(arr[curr]>x){
                return recursion(arr,x,start , curr-1);
            }
            else{
                return recursion(arr, x , curr+1 , end);
            
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70};
        System.out.println("Normal Loop , index of 50 : "+normal(arr,50)+", 25 : "+normal(arr,25)+", 70 :"+normal(arr,70));
        System.out.println("Recursive , index of 50 : "+recursion(arr,50,0,arr.length-1)+", 25 : "+recursion(arr,25,0,arr.length-1)+", 70 :"+recursion(arr,70,0,arr.length-1));
    }
}