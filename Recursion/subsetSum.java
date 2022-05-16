// import java.util.ArrayList;
public class subsetSum {
    static int count = 0;
    //CHECK

    // static void subset(int arr[], ArrayList<Integer> curr,int start){
    //     if(start==arr.length){
    //         System.out.println(curr);
    //         return;
    //     }
    //     System.out.println("this --> "+curr+" "+start);
    //     subset(arr,curr,start+1);     
    //     curr.add(arr[start]);
    //     System.out.println("that --> "+curr+" "+start);
    //     subset(arr,curr,start+1);
    // }
    
    //Bitwise method

    // static int binarySubset(int arr[],int sum){
    //     int count = 0;
    //     for(int i = 0; i<=(int)Math.pow(2,arr.length)-1; i++){
    //         int ans = 0;
    //         for(int j = 0; j<arr.length; j++){
    //             if ((i&(1<<j))!=0){
    //                 ans += arr[j];
    //             }
    //         }
    //         if(ans==sum){
    //             count+=1;
    //         }

    //     }
    //     return count;
    // }

    //Recursive method

    static int sumRec(int arr[], int sum, int start){
        if(start==arr.length){
            return sum==0?1:0;
        }
        return sumRec(arr, sum, start+1) + sumRec(arr, sum-arr[start],start+1);
    }

    public static void main(String args[]){
        // int arr[] = {1,2};
        // ArrayList<Integer> curr = new ArrayList<Integer>();
        // int start = 0;
        // subset(arr,curr,start);
        // System.out.println(count);

        // int arr[] = {9,4,3,6,5};
        // int sum = 9;
        // int ans = binarySubset(arr,sum);
        // System.out.println(ans);


        int arr [] = {9,4,5,6,3};
        int sum = 9;
        int count = sumRec(arr,sum,0);
        System.out.println(count);
    }
}
