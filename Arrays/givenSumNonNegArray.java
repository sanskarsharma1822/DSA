public class givenSumNonNegArray {
    static boolean slide(int arr[] , int sum){
        int start = 0;
        int windowSum = arr[0];
        for(int i = 1 ; i<arr.length ; i++){            
            while(windowSum>sum && start<i-1){
                windowSum -= arr[start];
                start++;
            }
            if(windowSum==sum){
                System.out.println("Sum found between index : "+start+" and "+(i-1));
                return true;
            }
            if(windowSum < sum){
                windowSum += arr[i];
                
            } 
        }
        return false;
    }
    public static void main(String args[]){
        int arr [] = {1,4,20,3,10,5};
        int givenSum = 33;
        System.out.println(slide(arr,givenSum));

    }
}
