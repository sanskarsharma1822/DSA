import java.util.Scanner;
public class powerSet {
    static Scanner sc = new Scanner(System.in);
    static void power(String str){
        int len = str.length();
        String s = "";
        int lenPower = (int)Math.pow(2,len);        
        String arr[] = new String [lenPower];
        for(int i = 0 ; i<lenPower ; i++){
            for( int j = 0; j<len ;j++){
                if((i & (1<<j))!=0){
                    // System.out.print(str.charAt(j));
                    s = s+str.charAt(j);
                }
            }
            arr[i] = s;
            s = "";
            // System.out.println();
        }
        for(int i = 0; i<lenPower ; i++){
            System.out.println("'" + arr[i] + "'");
        }
    }
    public static void main(String a[]){
        String s = sc.nextLine();
        power(s);
    }
}
