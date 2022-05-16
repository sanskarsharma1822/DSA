import java.util.Scanner;
public class factorial {
    static Scanner sc = new Scanner(System.in);
    static int k = 1;
    int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    int factTail(int n, int k){
        if(n==0){
            return k;
        }
        return factTail(n-1,k*n);
    }

    public static void main(String args[]){
        int n = sc.nextInt();
        factorial obj = new factorial();
        int ans1  = obj.fact(n);
        int ans2 = obj.factTail(n,k);
        System.out.print(ans1 + " " + ans2);
    }
}
