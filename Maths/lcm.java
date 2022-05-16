import java.util.*;
public class lcm {
    static Scanner sc = new Scanner(System.in);
    static int lcm;
    int gcd(int a, int b){
        if(b==0){
            return a ;
        }else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args){
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //Naive Method
        // int max = Math.max(num1,num2);
        // for(int i = max;;i++){
        //     if(i%num1==0 && i%num2==0){
        //         lcm = i;
        //         break;
        //     }
        // }
        

        //Optimized approach lcm = a*b/gcd;
            lcm obj = new lcm();
            int gcd = obj.gcd(num1,num2);
            lcm = (num1*num2)/gcd;

            System.out.println("Lcm is : "+lcm);
    }
}
