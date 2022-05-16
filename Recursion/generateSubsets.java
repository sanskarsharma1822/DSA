import java.util.Scanner;
public class generateSubsets {
    static Scanner sc= new Scanner(System.in);
    static void generateSub(String s,String curr, int len){
        if(len == s.length()){
            System.out.println(curr + " ");
            return;
        }        
        generateSub(s,curr+"",len+1);
        generateSub(s,curr+s.charAt(len),len+1);
    }
    public static void main(String args[]){
        String s = sc.nextLine();
        generateSub(s,"",0);
    }
}
