public class searchInSortedAndRotated {
    static int search(int arr[], int x){
        int start = 0 ;
        int end = arr.length-1 ;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[start] < arr[mid]){
                if(x>=arr[start]&& x<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            else{
                if(x<=arr[end] && x>arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {10, 20, 40, 60, 5, 8};
		int x = 4;
        System.out.println(search(arr, x));

    }
}
