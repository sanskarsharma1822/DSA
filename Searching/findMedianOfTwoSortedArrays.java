import java.util.*;
public class findMedianOfTwoSortedArrays {
    static float naive(int arr1[] , int arr2[]){
        int ind1 = 0;
        int ind2 = 0;
        ArrayList<Integer> combined = new ArrayList<Integer>();
        while(ind1!= arr1.length && ind2 != arr2.length){
            if(arr1[ind1]<arr2[ind2]){
                combined.add(arr1[ind1]);            
                ind1+=1;
            }
            else if(arr1[ind1] > arr2[ind2]){
                combined.add(arr2[ind2]);          
                ind2+=1;
            }else{
                combined.add(arr1[ind1]);
                ind1+=1;
                ind2+=1;
            }
            
        }
        
        if(ind1==arr1.length && ind2!= arr2.length){
            for(int i = ind2; i<arr2.length ; i++){
                combined.add(arr2[i]);
            }
        }
        else if(ind2==arr2.length && ind1!= arr1.length){
            for(int i = ind1; i<arr1.length ; i++){
                combined.add(arr1[i]);
            }
        }
        System.out.println(combined);
        if(combined.size()%2 == 0){
            return (float)(combined.get((combined.size()-1)/2) + combined.get(((combined.size()-1)/2)+1))/2;
        }
        return combined.get((combined.size()-1)/2);

    }
    public static void main(String args[]){
        int arr1[] = {10,20,30,40,50,60};
        int arr2[] = {5,15,25,35};
        System.out.println("Median of both arrays is : "+naive(arr1,arr2));
    }
}
