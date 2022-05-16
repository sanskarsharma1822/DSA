import java.util.Scanner;
public class factorial {
    static int fac(int num){
        if(num==1||num==0){
            return 1;
        }
        else{
            return num*fac(num-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fac(number));
        sc.close();
    }
}
