public class maxConsecutiveOnes {
    static int max(int arr[]){
        int mostOnes = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==1){
                int count = 1;
                for(int j = i+1;j<arr.length;j++){
                    if(arr[j]==0){
                        break;
                    }
                    if(arr[j]==1){
                        count++;
                    }
                }
                if(count>mostOnes){
                    mostOnes = count;
                }
            }
        }
        return mostOnes;
    }

    static int best(int arr[]){
        int count = 0 ;
        int max = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==1){
                count++;
            }
            else{
                if(count>max){
                    max = count;
                }
                count=0;
            }
        }
        if(count>max){
            max = count;
        }

        return max;
    }

    
    public static void main(String args[]){
        int arr[ ] = {1,0,1,1,1,1,0,1,1,1,1,1};
        // int arr[] = {1,1,1,1};
        System.out.println("Max Consecutive ones are : " + max(arr));
        System.out.println("Max Consecutive ones are : "+best(arr));

    }
}
