public class segregateEvenAndOdd {
    static void hoare(int arr[]){
        int i = -1;
        int j = arr.length;
        while(true){
            do{
                i++;
            }while(arr[i]%2==0);
            do{
                j--;
            }while(arr[j]%2!=0);
            if(i>=j){
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {10,2,3,13,4,5};
        hoare(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
