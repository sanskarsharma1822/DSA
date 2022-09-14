import java.util.ArrayList;

class MyHash{
    int BUCKET;
    int size = 0;
    ArrayList<Integer> table = new ArrayList<>();
    MyHash(int k){
        BUCKET = k;
        for(int i = 0 ; i < BUCKET ; i++){
            table.add(-1);
        }
    }
    boolean insert(int val){
        if(size==BUCKET){
            return false;
        }
        int probe = (val%BUCKET);
        while(table.get(probe)!=-1 || table.get(probe)!=-2 || table.get(probe)!=val){
            probe = (probe+1)%BUCKET;
        }
        if(table.get(probe) == val){
            return false;
        }
        else{
            table.set(probe, val);
            size++;
            return true;
        }
    }

    boolean delete(int val){
        int probe = (val%BUCKET);
        int starting = probe;
        while(table.get(probe)!=-1){
            if(table.get(probe)== val){
                table.set(probe,-2);
                size--;
                return true;
            }
            probe = (probe+1)%BUCKET;   
            if(starting == probe){
                return false;
            }
        }
        return false;
    }

    boolean search(int k){
        int probe = (k%BUCKET);
        int starting = probe;
        while(table.get(probe)!=-1){
            if(table.get(probe)== k ){
                return true;
            }
            probe = (probe+1)%BUCKET;
            if(starting == probe){
                return false;
            }
        }   
        return false;
    }


    void dispalyAll(){
        System.out.print(table);
        System.out.println();
    }

}
public class OpenAddressing {
    public static void main(String[] args) 
	{ 
	    MyHash mh = new MyHash(7);
        mh.dispalyAll();
	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
        mh.insert(22);
        mh.insert(14);
        mh.insert(23);
        mh.insert(25);
        mh.delete(16);
	    System.out.println(mh.search(14));
	    // mh.search(16);
	    // System.out.println(mh.search(15));
        mh.dispalyAll();
        
	} 
}
