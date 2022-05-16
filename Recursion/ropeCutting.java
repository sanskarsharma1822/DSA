import java.util.Scanner;

public class ropeCutting {
    static Scanner sc = new Scanner(System.in);
    static int maxPieces = 0;
    static int maximum(int rope, int maxPieces , int a, int b ,int c){
        if(rope == 0){
            return maxPieces;
        }
        if(rope<a && rope < b && rope <c){
            return -1;
        }
        return Math.max(maximum(rope-a,maxPieces+1,a,b,c),Math.max(maximum(rope-b,maxPieces+1,a,b,c), maximum(rope-c,maxPieces+1,a,b,c)));
    }
    public static void main(String args[]){
        int rope = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = maximum(rope,maxPieces,a,b,c);
        System.out.println(ans);
    }
}