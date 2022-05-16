public class frequencies {
    static void freq(int arr[]){
        int curr_elem = arr[0];
        int curr_count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==curr_elem){
                curr_count++;
            }
            else{
                System.out.println(curr_elem + ": "+ curr_count);
                curr_elem = arr[i];
                curr_count = 1;
            }
        }
        System.out.println(curr_elem + ": "+ curr_count);
    }
    public static void main(String args[]){
        // int arr[] = {10,10,10,20,20,30,30,30};
        // int arr[] = {10,20,30};
        int arr[] = {10,10,10};
        freq(arr);
    }
}
