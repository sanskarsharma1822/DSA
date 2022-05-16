public class permutations {
    static String swap(String s, int i, int j){
        char ch[] = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        String changed = new String(ch);
        return changed;
    }
    static void perm(String s, int len){
        if(len==s.length()-1){
            System.out.println(s + " ");
            return;
        }
        for(int j = len; j<s.length();j++){
            s = swap(s,j,len);
            perm(s,len+1);
            s = swap(s,len,j);
        }
        }
    public static void main(String args[]){
        perm("ABCD",0);
    }
}
