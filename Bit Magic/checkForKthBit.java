import java.util.*;
public class checkForKthBit {
    static Scanner sc = new Scanner(System.in);
    boolean check(int num , int k ){
        int test = (int)Math.pow(2,(k-1));
        int val = num&test;
        if(val==0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args){
        int num = sc.nextInt();
        int k = sc.nextInt();
        checkForKthBit obj = new checkForKthBit();
        boolean present = obj.check(num,k);
        System.out.println(present);
    }
}
