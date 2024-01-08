public class MaximumNumberOfVowelsInASubstringofGivenLength {
    public int maxVowels(String s, int k) {
        int count=0;
        int maxCount=0;
        for(int i=0; i<k;i++){
            if(isVowel(s.charAt(i))) count++;
        }
        maxCount = count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i-k))) count--;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
    boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    /*public int maxVowels(String s, int k) {
        int l=0,count=0,maxCount=0;

        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))) count++;
            if(i-l+1 > k){
                if(isVowel(s.charAt(l))) count--;
                l++;
            }
            maxCount = (count>maxCount) ? count : maxCount;
        }

        return maxCount;
    }*/
}
