import java.util.Scanner;
public class computingpower {
    static Scanner sc = new Scanner(System.in);
    static long result = 1;
    long basic(int num, int pow){
        if(pow<=0)
            return 1;
        for(int i = 1; i<=pow ; i++){
            result *= num;
        }
        return result;
    }

    static int optimize(int num, int pow){
        if(pow==0){
            return 1;
        }
        if(pow==1){
            return num;
        }
        if(pow%2==0){
            return optimize(num,pow/2)*optimize(num,pow/2);
        }
        return optimize(num,pow-1)*num;
    }

    static long iterativePower(int num , int pow){
        while(pow>0){
            if(pow%2!=0){
                result*=num;
            }
            num*=num;
            pow/=2;
        }
        return result;
    }
    public static void main(String args[]){
        int num = sc.nextInt();
        int pow = sc.nextInt();
        

        //Naive Approach 
        // result = obj.basic(num, pow);
        

        //Optimize Approach
        // result = optimize(num, pow);

        //Bit Solution
        result = iterativePower(num, pow);


        System.out.println(result);


    }
}
