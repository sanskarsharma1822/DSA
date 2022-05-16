import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc1.nextInt();
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("Digits are : "+count);
        sc1.close();
    }    
}
