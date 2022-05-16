public class longestEvenOddSubarray {
    static int subarray(int arr[]){
        boolean lastEven = arr[0]%2==0?true:false;
        int max = 1;
        int count = 1;
        for(int i = 1 ; i<arr.length;i++){
            if(lastEven&&arr[i]%2!=0){
                count++;
                lastEven = false;
            }
            else if(!lastEven&&arr[i]%2==0){
                count++;
                lastEven = true;
            }
            else{
                if(count>max){
                    max = count;
                }
                count=1;
                lastEven = arr[i]%2==0?true:false;
            }
        }
        if(count>max){
            max = count;
        }
        return max;
    }
    public static void main(String args[]){
        
        // int arr[] = {10,12,14,7,8};
        // int arr[] = {7,10,13,7,6,4,7,8,9,10};
        int arr[] = {4,7};
        // int arr[] = {10,12,8,4};

        System.out.println("Size of longest even odd subarray is : "+subarray(arr));
    }
}
