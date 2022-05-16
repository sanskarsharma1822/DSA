import java.util.*;
public class gcd {
    static Scanner sc = new Scanner(System.in);
    static int gcd = 1;

    static int euclid(int a, int b){
        while (a!=b){
            if(b>a)
                return euclid(a,b-a);
            else
                return euclid(a-b,b);
        }
        return a;
    }

    static int euclidOpt(int a, int b){
        if(b==0){
            return a;
        }else{
            return euclidOpt(b,a%b);
        }
    }
    public static void main(String[] args){
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //Naive approach        
        // int lower = num1>num2?num2:num1;        
        // for(int i=1;i<=lower;i++){
        //     if(num1%i ==0 && num2%i == 0){
        //         gcd = i;
        //     }
        // }

        //Better Naive Approach, Decreasing one
        // int lower = Math.min(num1,num2);
        // for(int i = lower;i>=1;i--){
        //     if(num1%i==0 && num2%i==0){
        //         gcd = i;
        //         break;
        //     }
        // }


        //Euclidean Theorem
        // gcd = euclid(num1,num2);

        //Euclid Optimized Theorem
        gcd = euclidOpt(num1,num2);



        System.out.println("Greatest common divisor of the two numbers is : "+gcd);
    }
}
