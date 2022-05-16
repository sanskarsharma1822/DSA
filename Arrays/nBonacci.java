public class nBonacci {
    static void bonacci(int n , int m){
        int arr[] = new int[m];
        for(int i = 0 ; i<n ; i++){
            if(i==n-1){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        int windowSum = 1;
        int start = 0;
        int end = n;
        arr[n] = 1 ;
        System.out.print(arr[n] + " ");
        for(int i = n+1 ; i<m ; i++){
            windowSum = windowSum - arr[start] + arr[end] ;
            arr[i] = windowSum;
            System.out.print(arr[i] + " ");
            start++;
            end++;
        }
    }
    public static void main(String args[]){
        int n = 3 ; 
        int m = 10;
        bonacci(n,m);
    }
}
