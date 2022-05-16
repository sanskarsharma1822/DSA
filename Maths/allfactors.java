import java.util.Scanner;
public class allfactors {
    static Scanner sc = new Scanner(System.in);
    void basicApproach(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
    void effective(int num){
        for(int i=1;i*i<num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        for(int i = (int)Math.sqrt(num);i>=1;i--){
            if(num%i==0){
                System.out.print(num/i + " ");
            }
        }
    }
    public static void main(String[] args){
        int num = sc.nextInt();
        allfactors obj = new allfactors();
        //Basic approach
        // obj.basicApproach(num);

        //Effective approach
        obj.effective(num);

    }
}
