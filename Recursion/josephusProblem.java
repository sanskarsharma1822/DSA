public class josephusProblem {
    static int jos(int n , int k){
        if(n==1){
            return 0;
        }
        return (jos(n-1,k) + k)%n;
    }
    public static void main(String args[]){
        int survivor = jos(5,3);
        System.out.println(survivor);
    }
}
