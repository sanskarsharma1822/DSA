public class hoare {
    static int part(int arr[], int left , int right){
        int pivot = arr[left];
        int i= left-1;
        int j = right+1;
        while(true){
        do{
            i++;
        }while(arr[i]<pivot);

        do{
            j--;
        }while(arr[j]>pivot);

        if(i>=j){
            return j;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    }
    public static void main(String args[]){
        int arr[] = {60,80,30,90,40,50,70};
        int ind = part(arr,0,arr.length-1);
        System.out.println(ind);
    }
}
