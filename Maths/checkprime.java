import java.util.*;
public class checkprime {
    static Scanner sc = new Scanner(System.in);
    static int prime;
    boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2||num==3){
            return true;
        }
        if(num%2==0||num%3==0){
            return false;
        }
        for(int j = 5; j*j <=num ; j+=6){
            if(num%j==0||num%(j+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int num = sc.nextInt();
        //Naive method
    //     if(num==1){
    //         prime = 1;
    //     }
    //     else{
    //     for(int i=2;i<=Math.sqrt(num);i++){
    //         if(num%i==0){
    //             prime = 1;
    //             break;
    //         }
    //     }
    // }
    //     if(prime==1){
    //         System.out.println("Number is not prime");
    //     }else{
    //         System.out.println("Number is prime");
    //     }


    //Optimized Solution
        checkprime obj = new checkprime();
        boolean ret = obj.isPrime(num);
        if(ret){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }

    }
}
