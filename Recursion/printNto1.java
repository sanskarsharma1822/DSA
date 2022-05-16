import java.util.Scanner;

public class printNto1 {
    static Scanner sc1 = new Scanner(System.in);

    static void nto1(int n ){
        if (n==0){
            return;
        }
        System.out.println(n);
        nto1(n-1);

    }

    public static void main(String args[]){
        int num = sc1.nextInt();
        nto1(num);

    }
}