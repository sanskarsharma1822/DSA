import java.util.Scanner;
public class fibonnaci {
    static Scanner sc = new Scanner(System.in);
    static int ans=1;
    static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);

    }
    public static void main(String args[]){
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
}
