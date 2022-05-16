public class leadersInArray{
    static void naive(int arr[]){
        for(int i= 0; i<arr.length;i++){            
        boolean isLeader = true;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] >= arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(arr[i]+" ");
            }
        }    
    }

    static void better (int arr[]){
        int temp[] = new int[arr.length];
        int curr_leader = arr[arr.length-1];
        // System.out.print(curr_leader + " ");
        temp[0] = curr_leader;
        int j = 1;
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]>curr_leader){
                // System.out.print(arr[i] +" ");
                temp[j] = arr[i];
                j++;
                curr_leader = arr[i];
            }
        }
        int low = 0 , high = temp.length-1;
        while(low<high){
            int t = temp[low];
            temp[low] = temp[high];
            temp[high] = t;
            low++;
            high--;
        }

        for(int i = 0 ; i<temp.length; i++){
            if(temp[i]!=0)
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {7,10,4,10,6,5,2};
        // int arr[] = {10,20,30};
        // int arr[] = {30,20,10};
        // naive(arr);
        better(arr);
    }}