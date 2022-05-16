public class trappingWater {
    static int space(int arr[]){
        int water = 0;
        for(int i =1 ;i<arr.length-1; i++){
            int lmax = arr[i];
            for(int j = i; j>=0;j--){
                if(arr[j]>lmax){
                    lmax = arr[j];
                }
            }
            int rmax = arr[i];
            for(int j = i; j<arr.length;j++){
                if(arr[j]>rmax){
                    rmax = arr[j];
                }
            }
            water+= Math.min(lmax,rmax) - arr[i];
        }
        return water;
    }
    static int time(int arr[]){
        int water = 0 ;
        int lmax[] = new int[arr.length];
        int rmax[] = new int[arr.length];
        lmax[0] = arr[0];
        rmax[arr.length-1] = arr[arr.length-1];
        for(int i = 1; i<arr.length;i++){
            lmax[i] = Math.max(lmax[i-1],arr[i]);
        }
        for(int i = arr.length-2; i>=0;i--){
            rmax[i] = Math.max(rmax[i+1],arr[i]);
        }
        for(int i = 1; i<arr.length-1;i++){
            water += Math.min(lmax[i],rmax[i]) - arr[i];
        }
        return water;
    }
    public static void main(String args[]){
        int arr[] = {3,0,1,2,5};
        System.out.println("Water trapped is : "+space(arr));
        System.out.println("Water trapped is : "+time(arr));
    }
}
