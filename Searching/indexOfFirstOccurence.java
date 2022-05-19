public class indexOfFirstOccurence {
    static int solRec(int arr[], int x, int start ,int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == x){
            if(mid == 0){
                return 0;
            }
            else if(arr[mid-1] == arr[mid]){
                return solRec(arr,x,start, mid-1);
            }else{
                return mid;
            }
        }
        else if(arr[mid]<x){
            return solRec(arr, x, mid+1 , end);
        }
        else{
            return solRec(arr, x, start, mid-1);
        }
        
    }
    static int solIter(int arr[], int x , int start , int end ){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                if(mid==0|| arr[mid] != arr[mid-1]){
                    return mid;
                }else{
                    end = mid-1;
                }
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1, 10, 10, 10 , 20 , 20 , 40};
        System.out.println("First occurence of 20 is (using Recursion) : "+solRec(arr,20,0,arr.length-1));
        System.out.println("First occurence of 20 is (using Iteration): "+solIter(arr,20,0,arr.length-1));
    }
}
