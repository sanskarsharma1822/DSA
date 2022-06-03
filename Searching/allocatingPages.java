public class allocatingPages {
    static int naive(int arr[] , int n,  int k){
        if(k==1){
            return sum(arr,0,n-1);
        }
        if(n==1){
            return arr[0];
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0 ;i<n ; i++){
            res = Math.min(res,Math.max(naive(arr,i,k-1) , sum(arr,i , n-1)));
        }
        return res;
    }
    static int sum(int arr[], int start , int  end){
        int s = 0;
        for(int i = start ; i<=end; i++){
            s += arr[i];
        }
        return s;
    }
    static int better(int arr[] , int k){
        int start = arr[0];
        int end = 0;
        for(int i = 0 ; i <arr.length ; i++){
            if(start<arr[i]){
                start = arr[i];
            }
            end +=arr[i];
        }
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
                int reqStudents = 1;
                int currSum = 0;
                for(int i = 0 ;  i< arr.length  ; i++){
                    if(currSum+arr[i]>mid){
                        currSum = arr[i];
                        reqStudents++;
                    }else{
                        currSum += arr[i];
                    }
                }
                if(reqStudents<=k){
                    System.out.println(start+" " + end);
                    ans = mid;
                    end = mid-1;
                }
                else{
                start  = mid+1; 
            }
        }
    return ans;
    }
    static boolean possible(int arr[] , int sum , int k ){
        int reqStudents = 1;
        int currSum = arr[0];
        for(int i = 1 ;  i< arr.length  ; i++){
            if(currSum>sum){
                currSum = arr[i];
                reqStudents++;
            }else{
                currSum += arr[i];
            }
        }
        if(reqStudents<k){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {10,20,10,30};
        int k = 2;
        System.out.println("Minimum number of pages : "+naive(arr,arr.length, k));
        System.out.println("Minimum number of pages : "+better(arr, k));
    }
}
