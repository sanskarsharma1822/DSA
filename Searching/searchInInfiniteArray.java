public class searchInInfiniteArray {
    static int search(int arr[], int x){
        if(arr[0] == x){
            return 0;
        }
        int i = 1;
        while(arr[i]<x){
            i*=2;
        }
        if(arr[i] == x){
            return i;
        }
        int start = i/2;
        int end = i-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                return mid;
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
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 40, 50};
		int x = 40;
        System.out.println(search(arr, x));
    }
}
