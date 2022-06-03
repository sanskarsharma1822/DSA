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
    static float better(int arr1[] , int arr2[]){
        int start = 0;
        int end = arr1.length;

        while(start<=end){
            int i1 = (start+end)/2;
            int i2 = ((arr1.length+arr2.length+1)/2) - i1;
            int left1 = i1==0?Integer.MIN_VALUE:arr1[i1-1];
            int right1 = i1==arr1.length-1?Integer.MAX_VALUE:arr1[i1];
            int left2 = i2==0?Integer.MIN_VALUE:arr2[i2-1];
            int right2 = i2==arr2.length-1?Integer.MAX_VALUE:arr2[i2];

            if(left1<=right2 && left2<=right1){
                if((arr1.length + arr2.length)%2==0){
                    return ((float)Math.min(right1,right2) + (float)Math.max(left1,left2)) /2;
                }
                else{
                    return (float)Math.max(left1,left2);
                }
            }
            else{
                if(left1>right2){
                    end = i1-1;
                }else{
                    start = i1+1;
                }
            }

        } 
        return 0;
    }
    public static void main(String args[]){
        int arr2[] = {10,20,30,40,50,60};
        int arr1[] = {5,15,25,35};
        System.out.println("Median of both arrays is : "+naive(arr1,arr2));
        System.out.println("Median of both arrays is : "+better(arr1,arr2));
    }
}
