import java.util.*;

class Hash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    Hash(int k){
        BUCKET = k;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0 ; i< BUCKET ; i++){
            table.add(new LinkedList<Integer>());
        }
   }
   void insert(Integer val){
    int i = val % BUCKET;
    table.get(i).add(val);
   }

   void delete(Integer val){
    int i = val% BUCKET;
    table.get(i).remove(val);
   }

   boolean search(Integer val){
    int i = val%BUCKET;
    return(table.get(i).contains((val)));
   }
}
public class Chaining {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Hash mh = new Hash(7);
        mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(10));
	    mh.delete(15);
	    System.out.println(mh.search(15));
    }
}
