import java.util.Scanner;
public class numberofSetBits {
    static Scanner sc = new Scanner(System.in);
    static void normal(int num){
        int count = 0;
        for(int i=num;i>=1;i/=2){
            if(i%2!=0){
                count+=1;
            }
        }
        System.out.println(count);

    }
    int recursive(int num){
        if(num>1){
            if(num%2!=0){
                return 1+ recursive(num/2);
            }
            return recursive(num/2);
        }
        else{
            return 1;
        }
        
    }
    int bitSimple(int num){
        int count = 0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    static int brianKerninganAlgo(int num){
        int count = 0;
        while(num>0){
            num = num&(num-1);
            count+=1;
        }
        return count;
    }

    static int [] lookUpTable = new int[255];

    void initialize(){
        lookUpTable[0]=0;
        for(int i=1;i<lookUpTable.length;i++){
            lookUpTable[i] = (i&1)+lookUpTable[i/2];
        }
    }

    int lookUp(int num){
        int count = lookUpTable[num&0xff]+lookUpTable[(num<<8)&0xff] +lookUpTable[(num<<16)&0xff]+ lookUpTable[(num<<24)&0xff];
        // lookUpTable[(num<<32)&0xff] + lookUpTable[(num<<40)+0xff] + lookUpTable[(num<<48)&0xff] + lookUpTable[(num<<56)];
        return count;
    }

    public static void main(String args[]){
        int number = sc.nextInt();
        numberofSetBits obj = new numberofSetBits();
        normal(number);
        int recursiveAns = obj.recursive(number);
        System.out.println(recursiveAns);
        int bitSimpleAns = obj.bitSimple(number);
        System.out.println(bitSimpleAns);
        int brianKerningAns = brianKerninganAlgo(number);
        System.out.println(brianKerningAns);
        obj.initialize();
        int lookUpAns = obj.lookUp(number);
        System.out.println(lookUpAns);

    }
}
