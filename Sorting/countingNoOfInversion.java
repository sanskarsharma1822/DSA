public class countingNoOfInversion {
    static int merge(int arr[] , int l , int m , int r){
        int leftLen = m-l+1;
        int rightLen = r-m;
        int left[] = new int[leftLen];
        int right[] = new int[rightLen];
        for(int i= 0 ; i<leftLen ; i++){
            left[i] = arr[l+i];
        }

        for(int i = 0 ; i<rightLen ; i++){
            right[i]  = arr[m+i+1];
        }

        int x = 0;
        int y = 0;
        int res = 0;
        int k = l;

        while(x<leftLen && y<rightLen){
            if(left[x] <= right[y]){
                arr[k] = left[x];
                x++;
            }
            else{
                arr[k] = right[y];
                y++;
                res+= leftLen - x;
            }
            k++;
        }

        while(x<leftLen){
            arr[k] = left[x];
            x++;k++;
        }

        while(y<rightLen){
            arr[k] = right[y];
            y++;k++;
        }

        return res;
    }

    static int mergeSort(int arr[] , int l , int r){
        int res = 0;
        if(r>l){
            int m = l + (r-l)/2;
            res+=mergeSort(arr, l, m);
            res+=mergeSort(arr, m+1,r);
            res+=merge(arr,l,m,r);
        }
        return res;
    }
    static int count(int arr[]){
        return(mergeSort(arr,0,arr.length-1));
    }
    public static void main(String args[]){
        int arr[] = {2,4,1,3,5};
        int ans = count(arr);
        System.out.println(ans);
    }
}
