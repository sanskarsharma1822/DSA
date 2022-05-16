import java.util.*;
public class sieveoferatosthenes{
    static Scanner sc = new Scanner(System.in);
    boolean checkIfPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2||num==3){
            return true;
        }
        if(num%2==0||num%3==0){
            return false;
        }
        for(int i =5 ; i*i<=num ; i+=6){
            if(num%i==0||num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    void basic(int num){
        sieveoferatosthenes ob = new sieveoferatosthenes();
        for(int i = 1 ; i<num; i++){
            if(ob.checkIfPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    void optimize(int num){
        boolean arr [] = new boolean[num+1];
        Arrays.fill(arr,true);
        for(int i = 2 ; i*i<=num; i++){
            if(arr[i]){
                for(int j = i*i;j<=num ; j+=i){
                    arr[j] = false;
                }
            }
        }
        for(int i = 2; i<=num ; i++){
            if(arr[i]){
                System.out.print(i +" ");
            }
        }

    }

    void shortest(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr,true);
        for(int i = 2; i<= num ; i++){
            if(arr[i]){
                for(int j = i*i;j<=num;j+=i){
                    arr[j] = false;
                }
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        int num = sc.nextInt();
        sieveoferatosthenes obj = new sieveoferatosthenes();
        
        //Naive Approach 
        // obj.basic(num);


        //Sieve of Eratosthenes
        // obj.optimize(num);

        //Shortest implementation of Sieve of Eratosthenes 
        obj.shortest(num);

    }
}