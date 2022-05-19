public class indexOfLastOccurence {
    static int solRec(int arr[] , int x , int start , int end){
        if(start>end){
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[mid] == x){
            if(mid==arr.length-1|| arr[mid] != arr[mid+1]){
                return mid;
            }
            else{
                return solRec(arr,x,mid+1,end);
            }
        }
        else if(arr[mid]<x){
            return solRec(arr, x , mid+1, end);
        }
        else{
            return solRec(arr, x, start , mid-1);
        }
    }

    static int solIter(int arr[] , int x , int start , int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                if(mid==arr.length-1||arr[mid]!=arr[mid+1]){
                    return mid;
                }else{
                    start = mid+1;
                }
            }
            else if(arr[mid]>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[] ){
        int arr[] = {10,15,20,20,40,40};
        System.out.println("Last occurence of 20 is (using Recursion) : "+solRec(arr, 20 , 0 , arr.length-1));
        System.out.println("Last occurence of 20 is (using Iteration) : "+solIter(arr, 20 , 0 , arr.length-1));
    }
}
