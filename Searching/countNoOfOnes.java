public class countNoOfOnes {
    static int ans(int arr[] , int x){
        int first = -1;
        int start = 0 ;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                if(mid==0||arr[mid]!= arr[mid-1]){
                    first = mid ;
                    break;
                }else{
                    end = mid-1;
                }
            }
            else if (arr[mid]<x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        if(first==-1){
            return 0;
        }
        int last = 0;
        start = 0 ;
        end = arr.length - 1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                if(mid==arr.length-1||arr[mid]!=arr[mid+1]){
                    last = mid;
                    break;
                }else{
                    start = mid+1;
                }
            }else if(arr[mid] > x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return (last - first +1);
    }
    static int better(int arr[]){
        int start = 0 ; 
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==1){
                if(mid==0||arr[mid]!=arr[mid-1]){
                    return arr.length - mid;
                }else{
                    end = mid-1;
                }
            }
            else if(arr[mid]==0){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {0,0,0,0,0,1,1,1,1,1,1};
        System.out.println("Count of 1s is : "+ans(arr,1));
        System.out.println("Count of 1s is : "+better(arr));
    }
}
