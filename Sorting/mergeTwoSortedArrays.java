public class mergeTwoSortedArrays{
    static void merge(int arr1[], int arr2[]){
        int n = 0;
        int m = 0;
        while(n!=arr1.length && m!= arr2.length){
            if(arr1[n] >= arr2[m]){
                System.out.print(arr2[m] + " ");
                m++;
            }else{
                System.out.print(arr1[n] + " ");
                n++;
            }
        }
        if(n==arr1.length && m<arr2.length){
            for(int i = m ; i<arr2.length ; i++){
                System.out.print(arr2[i] + " ");
            }
        }
        if(m==arr2.length && n<arr1.length){
            for(int i = n ; i<arr1.length ; i++){
                System.out.print(arr2[i] + " ");
            }
        }
    }
    public static void main(String args[]){
        int arr1[] = {10,20,35};
        int arr2[] = {5,50,50};
        merge(arr1,arr2);
    }
}