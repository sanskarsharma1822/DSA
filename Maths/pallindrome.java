import java.util.Scanner;
public class pallindrome {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int num = number;
    int reverse = 0;
    int rem = 0;
    while(number!=0){
        rem = number%10;
        reverse = (reverse*10)+rem;
        number=number/10;

    }
    if(reverse==num){
        System.out.println("True");
    }else{
        System.out.println("False");
    }
    sc.close();
   } 
}
