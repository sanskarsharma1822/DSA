import java.util.Scanner;
public class checkPalindrome {
    static Scanner sc = new Scanner(System.in);
    static String reverse = "";

    static boolean check(String s, int end ){
        if(end>=0){
        reverse = reverse + s.charAt(end);
        check(s,end-1);
        }
        if(reverse.equals(s)){
            return true;
        }
        return false;
        
    }

    static boolean checkBetter(String s ,int start, int end){
        if(start>=end){
            return true;
        }
        return s.charAt(start) == s.charAt(end) && checkBetter(s, start+1,end-1);
    }
   
    public static void main(String args[]){
        String s = sc.nextLine();
        boolean ans = check(s,s.length()-1);
        System.out.println(ans);
        boolean better = checkBetter(s,0, s.length()-1);
        System.out.println(better);
    }
}
