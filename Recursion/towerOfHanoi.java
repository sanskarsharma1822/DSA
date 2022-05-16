public class towerOfHanoi {
    static void toh(int n, char source, char mid, char dest){
        if(n==1){
            System.out.println("Move 1 from "+source+" to "+dest);
            return;
        }
        toh(n-1,source,dest,mid);
        System.out.println("Move "+n+" from "+source+" to "+dest);
        toh(n-1,mid,source,dest);
    }
    public static void main(String args[]){
        toh(3,'A','B','C');
    }
    
}
