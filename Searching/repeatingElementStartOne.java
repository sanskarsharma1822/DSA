public class repeatingElementStartOne {
    static int sol(int arr[]){
        int slow = arr[0] ; 
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);
        slow = arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast= arr[fast];
        }
        return slow;
    }
    public static void main(String args[]){
        int arr[] = {2,2,4,3,1,5,6};
        System.out.println("The repeating elements is : "+sol(arr));
    }
}
