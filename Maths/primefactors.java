import java.util.*;
public class primefactors {
    static Scanner sc = new Scanner(System.in);
    void effective(int num){
        if(num<=1)
            return;
        for(int i=2;i*i<=num;i++){
            while(num%i==0){
                System.out.print(i+ " ");
                num=num/i;
            }
        }
        if(num>1){
            System.out.print(num);
        }
    }

    void best(int num){
        if(num<=1)
            return;
        while(num%2==0){
            System.out.print("2 ");
            num = num/2;
        }
        while(num%3==0){
            System.out.print("3 ");
            num=num/3;
        }
        for(int i =5;i*i<=num ; i+=6){
            while(num%i==0){
                System.out.print(i+" ");
                num/=i;
            }
            while(num%(i+2)==0){
                System.out.print(i+2 +" ");
                num/=(i+2);
            }
        }
        if(num>3){
            System.out.print(num);
        }
    }
    public static void main(String[] args){
        int num = sc.nextInt();
        primefactors obj = new primefactors();
        //Optimized Approach
        // obj.effective(num);

        //Best Approach
        obj.best(num);
    }
}
