import java.util.Scanner;
public class sumofFirstNatural {
    static Scanner sc = new Scanner(System.in);
    static int sum(int num){
        if (num==1){
            return 1;
        }
        return num+sum(num-1);
    }

    static int directSum(int n){
        return n*(n+1)/2;
    }
    public static void main(String args[]){
        int num = sc.nextInt();
        int ans = sum(num);
        int directAns = directSum(num);
        System.out.println(ans + " "+ directAns);
    } 
}
