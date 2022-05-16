
public class majorityElement {
    static int maj(int arr[]){
        int count = 0;

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count>arr.length/2){
                return i;
            }
        }
        return -1;
    }
    static int boyerMauriceAlg(int arr[]){
        int ans = 0; int count = 1;
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i] == arr[ans]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ans = i ; 
                count = 1;
            }
        }
        count= 0 ;
        for(int i  = 0 ; i<arr.length ; i++){
            if(arr[i]== arr[ans]){
                count++;
            }
        }
        if(count<arr.length/2){
            return -1;
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {8,3,4,8,8,8};
        // int arr[] = {3,7,4,7,7,5};
        // int arr[] = {20,30,40,50,50,50,50};
        System.out.println("Index of majority element is : "+maj(arr));
        System.out.println("Index of majority elemtent is : "+boyerMauriceAlg(arr));


    }
}
