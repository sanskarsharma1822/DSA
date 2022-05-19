public class countNoOfOccurences {
    static int occ(int arr[] , int x){
        int first = -1;
        int start = 0 ; int end = arr.length -1 ;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                if(mid==0||arr[mid]!=arr[mid-1]){
                    first = mid;
                    break;
                }else{
                    end = mid-1;
                }
            }
            else if (arr[mid]<x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(first == -1 ){
            return 0;
        }
        
        start = 0 ; end = arr.length -1 ;
        int last = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                if(mid==arr.length-1||arr[mid]!= arr[mid+1]){
                    last = mid;
                    break;
                }else{
                    start = mid+1;
                }
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return (last-first+1);
    }
    public static void main(String args[]){
        int arr[] = {1, 10 ,10 ,20 ,20 ,20 ,40 ,50, 50 , 50};
        System.out.println("Number of occurences of 20 are : "+occ(arr, 20));
    }
}
