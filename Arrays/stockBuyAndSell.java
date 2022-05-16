public class stockBuyAndSell {
    static int naive(int arr[],int start,int end){
        if(start>=end){
            return 0 ;
        }
        
        int profit = 0 ;
        for(int i = start ; i<end ; i++){
            for(int j = i+1;j<=end;j++){
                if(arr[j]>arr[i])
                {int curr_profit = arr[j] - arr[i] + naive(arr,start,i-1) + naive(arr,j+1,end);
                profit = Math.max(profit, curr_profit);}
            }
        }
        return profit;
    }

    static int best(int arr[]){
        int profit = 0;
        for(int i = 0 ; i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                profit+= arr[i+1]-arr[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int arr [] = {1,5,3,8,12};
        System.out.println("Naive approach ans : "+naive(arr,0,arr.length-1));
        System.out.println("Best approach ans  : "+best(arr));
    }
}
