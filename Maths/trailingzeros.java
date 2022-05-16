import java.util.*;
public class trailingzeros{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int num = sc.nextInt();
        int div = 5;
        int temp = num,trailingZeros = 0;
        while(temp/div !=0){
            trailingZeros += temp/div;
            div *= 5;
        }
        System.out.println("Number of trailing zeros in factorial of "+num+" are : "+trailingZeros);
    }
}