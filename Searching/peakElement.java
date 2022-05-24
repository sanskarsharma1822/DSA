public class peakElement {
    static int sol(int arr[]){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if((mid==0|| arr[mid]>=arr[mid-1])&&(mid==arr.length-1 || arr[mid]>=arr[mid+1])){
                return arr[mid];
            }
            else if(mid<arr.length-1&&arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {5, 20, 40, 30, 20, 50, 60};
        System.out.println("Peak element is : "+ sol(arr));
    }
}
