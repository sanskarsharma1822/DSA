public class searchInSortedMatrix {
    static void search(int arr[][] , int x){
        int i = 0 ;
        int j = arr[0].length - 1;
        while(i<arr.length && j >=0 ){
            if(arr[i][j] == x){
                System.out.println("Found at  : "+i +" "+ j);
                return;
            }
            else if(arr[i][j] > x ){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not found");
        

    }
    public static void main(String args[]){
        int arr[][] = {{10,20,30,40},{15,25,35,45},{17,27,37,47},{19,29,39,49}};
        search(arr , 35);
    }
}
