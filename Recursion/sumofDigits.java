import java.util.Scanner;
public class sumofDigits {
    static Scanner sc = new Scanner(System.in);
    static int s = 0;
    static int sum(int num){
        if (num==0){
            return 0;
        }
        return num%10 + sum(num/10);
    }
    public static void main(String argsp[]){
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
}
