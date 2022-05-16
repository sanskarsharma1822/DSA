import java.util.Scanner;
public class oneOddOccuring {
    static Scanner sc = new Scanner(System.in);
    static int oddOccurring(int numArr []){
        int ans = 0;
        for(int i = 0;i<numArr.length;i++){
            ans = ans^numArr[i];
        }
        return ans;
    }
    static int notInArray(int numArr[] , int n){
        int notfound = 0;
        int all = 0;
        for(int i=0;i<n;i++){
            notfound = notfound^numArr[i];
        }
        for(int i=1;i<=n+1;i++){
            all = all^i;
        }
        return notfound^all;
        
    }
    static int pigeonHole(int numArr[] , int n){
        int all = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            ans = ans^numArr[i];
        }
        for(int i =1;i<n;i++){
            all = all^i;
        }
        return all^ans;
   }
    public static void main(String a[]){
        int arr[] = new int[20];
        System.out.println("Number of elements the array has :");
        int len = sc.nextInt();
        System.out.println("Enter elements of array :");
        for (int i = 0 ;i<len;i++){
            arr[i] = sc.nextInt();
            
        }
        // int oddNum = oddOccurring(arr);
        // System.out.println(oddNum);
        
        // int notfound = notInArray(arr,len);
        // System.out.println(notfound);

        int pigeonhole = pigeonHole(arr, len);
        System.out.println(pigeonhole);
    }
}
