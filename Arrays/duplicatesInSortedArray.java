public class duplicatesInSortedArray {

    static int remove(int arr[]){
        int res = 1;
        int dis = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]!=dis){
                dis = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {10,10,20,20,20,30,30,30,30,40};
        System.out.println("Size of array with no duplicates is : " +remove(arr));
    }
}
