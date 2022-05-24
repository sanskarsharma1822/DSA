public class findPythagoreanTriplet {
    static boolean search(int arr[]){
        for(int i = arr.length-1; i>0 ;i--){
            int start = 0;
            int end = i-1;
            int x = arr[i]*arr[i];
            while(start<end){
                int sum = (int)Math.pow(arr[start],2) + (int)Math.pow(arr[end],2);
                if(sum == x){
                    return true;
                }
                else if(sum<x){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {2,10,15,22,32,36,56,60,77,80,84,85,90};
        System.out.println(search(arr));

    }
}
