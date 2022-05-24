public class squareRoot {
    static int sol(int num){
        int start = 0 ;
        int end = num;
        int ans = 0;
        int lowAns = 0;
        int highAns = 0;
        while(start<=end){
            int mid = (start+end)/2;
            int sq = mid*mid;
            if(sq==num){
                return mid;
            }
            else if(sq<num){
                ans = mid;
                start = mid+1;
                lowAns = mid;
            }
            else{
                end = mid-1;
                highAns = mid;
            }
        }
        System.out.println("Low : "+lowAns+" High : "+highAns);
        return ans;
    }
    public static void main(String args[]){
        int num = 27;
        System.out.println("Floor of square root is : " + sol(num));
    }
}
