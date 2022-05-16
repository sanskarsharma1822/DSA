import java.util.Scanner;
public class powerof2 {
    static Scanner sc = new Scanner(System.in);
    boolean naive(int num){
        int count = 0;
        if(num==0){
            return false;
        }
        while(num>0){
            num = num & (num-1);
            count+=1;
            if(count>1){
                return false;
            }
        }
            return true;

    }
    boolean effiecient(int n ){
        return ((n!=0)&&((n&(n-1))==0));
    }
    public static void main(String args[]){
        int number = sc.nextInt();
        powerof2 obj = new powerof2();
        boolean naiveAns = obj.naive(number);
        System.out.println(naiveAns);
        boolean effecient = obj.effiecient(number);
        System.out.println(effecient);
        }
}
