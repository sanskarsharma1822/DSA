public class intersectionOfTwoSortedArrays {
    static void intersection(int arr1[] , int arr2[]){
        int m = 0;
        int n = 0;
        

        while(m<arr1.length && n<arr2.length){
            if(m>0 && arr1[m] == arr1[m-1]){
                m++;
                continue;
            }
            
            if(arr1[m] > arr2[n]){
                n++;
            }
            else if(arr1[m] <arr2[n]){
                m++;
            }
            else{
                System.out.println(arr1[m]);
                m++;
                n++;
            }
            
        }
    }
    public static void main(String args[]){
        int arr1[] = {3,5,10,10,10,15,15,20};
        int arr2[] = {5,10,10,15,30};
        intersection(arr1, arr2);

    }
}
