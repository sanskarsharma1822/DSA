public class operationsOnArrays{
    static int search(int arr[], int find){
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==find){
                return i;
            }
        }
        return -1;
    }

    static int insert(int arr[] , int n, int cap, int elem, int ind){
        if(n==cap){
            return n;
        }
        else{
            if(ind==cap-1){
                arr[cap-1] = elem;
            }
            else{
                for(int i = n-1;i>=ind;i--){
                    arr[i+1] = arr[i];
                }
                arr[ind] = elem;
            }
            return n+1;
        }
    }

    static int delete(int arr[], int n, int cap, int elem){
        if(n==0){
            return 0;
        }
        else{
            int ind = search(arr,elem);
            System.out.println("This is index : "+ind);
            if(ind==-1){
                return n;
            }
            if(ind==n){
                return n-1;
            }
            for(int i = ind;i<n-1;i++){
                arr[i] = arr[i+1];
            }

            return n-1;
            // if(ind ==-1){
            //     return n;
            // }else{
            //     for(int i =ind+1;i<n;i++){
            //         arr[i] = arr[i+1];
            //     }
            // }
            // return n-1;
        }
    }
    public static void main(String args[]){
        int[] arr = {23,54,5,67,2,5};
        System.out.println("First index of 5 is : "+search(arr,5));
    

        int[] arr1 = new int[5];
        arr1[0] = 10; arr1[1] = 20; arr1[2] = 30; arr1[3] = 40;
        int elem = 5; 
        int ind = 2;
        int cap=arr1.length;
        int n = 4;
        System.out.println("Array after insertion of 5 at index 2 is : ");
        n = insert(arr1,n,cap,elem,ind);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        int [] arr2 = {1,2,3,4,5};
        System.out.println("Array after deletion of 3 is :");
        int n1 = 5;
        int cap1 = 5;
        int elem1 = 3;
        n1 = delete(arr2,n1,cap1,elem1);
        for(int i=0;i<n1;i++){
            System.out.println(arr2[i]);
        }
    }
}