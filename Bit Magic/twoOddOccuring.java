import java.util.Scanner;
public class twoOddOccuring {
    static Scanner sc = new Scanner(System.in);
    static void twoOdd(int arrNum[] , int size){
        int allXor = 0;
        int ans1 = 0;
        int ans2 =0;
        for(int i = 0; i<size ; i++){
            allXor = allXor^arrNum[i];
        }
        int lastSet = allXor & (~(allXor - 1));
        for (int i = 0;i<size ; i++){
            if((arrNum[i] & lastSet) !=0){
                ans1 = ans1^arrNum[i];
            }else{
                ans2 = ans2^arrNum[i];
            }
        }
        System.out.println(ans1 + " " + ans2);
    }
    public static void main(String a[]){
        System.out.println("Enter size of array : ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter elements of array : ");
        for(int i = 0; i<len;i++){
            arr[i] = sc.nextInt();
        }
        twoOdd(arr,len);
    }
}
