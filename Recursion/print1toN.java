import java.util.Scanner;
public class print1toN {
    static Scanner sc = new Scanner(System.in);
    void fun(int n ){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n = sc.nextInt();
        print1toN obj = new print1toN();
        obj.fun(n);
    }
}
