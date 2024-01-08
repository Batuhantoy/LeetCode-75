public class IsSubsequence {
    // 1 ms - 41.77 (%91, %5)
    /*String S,T;
    private boolean checkSubsequence(int i, int j){
        if(i == -1){
            return true;
        }
        if(j == -1){
            return false;
        }
        if(S.charAt(i) == T.charAt(j)){
            return checkSubsequence(i-1,j-1);
        }
        return checkSubsequence(i,j-1);
    }
    public boolean isSubsequence(String s, String t) {
        S=s;
        T=t;
        return checkSubsequence(s.length()-1,t.length()-1);
    }*/

    // 1 ms - 40.56 (%91, %35)
    /*public boolean isSubsequence(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;

        while(i>=0 && j>=0){
            if(s.charAt(i) == t.charAt(j)){
                i--;
                j--;
            }else{
                j--;
            }
        }
        if(i>=0){
            return false;
        }
        return true;
    }*/

    // 1 ms - 40.36 (%91, %59)
   /*public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){return false;}

        int i = 0;
        int j = 0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }*/
}
