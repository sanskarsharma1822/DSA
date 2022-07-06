public class unionOfTwoSortedArrays {
    static void union(int arr1[] , int arr2[]){
        int m = 0 ;
        int n = 0;
        while(m<arr1.length && n < arr2.length ){
            if(m>0 && arr1[m] == arr1[m-1]){
                m++;
                continue;
            }
            if(n>0 && arr2[n]==arr2[n-1]){
                n++;
                continue;
            }
            if(arr1[m]>arr2[n]){
                System.out.print(arr2[n] + " ");
                n++;
            }
            else if(arr1[m] < arr2[n]){
                System.out.print(arr1[m] + " ");
                m++;
            }
            else{
                System.out.print(arr1[m] + " ");
                m++;
                n++;
            }
        }
        
        while(m<arr1.length){
            if(m>0 && arr1[m]==arr1[m-1]){
                m++;
                continue;
            }
            else{
                System.out.print(arr1[m] + " ");
                m++;
            }
        }

        while(n<arr2.length){
            if(n>0 && arr2[n]==arr2[n-1]){
                n++;
                continue;
            }
            else{
                System.out.print(arr2[n] + " ");
                n++;
            }
        }
    }
    public static void main(String args[]){
        int arr1[] = {3,5,8};
        int arr2[] =  {2,8,9,10,15};
        union(arr1,arr2);  
    }
}
