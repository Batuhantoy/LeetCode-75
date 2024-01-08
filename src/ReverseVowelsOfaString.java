public class ReverseVowelsOfaString {

    // Using left and right pointers to find vowels then swap their places
    public String reverseVowels(String s) {
        int leftPointer =0;
        int rightPointer = s.length() -1;
        char[] word = s.toCharArray();
        while(leftPointer < rightPointer){
            if(!isVowel(word[leftPointer])){
                leftPointer++;
                continue;
            }
            if(!isVowel(word[rightPointer])){
                rightPointer--;
                continue;
            }
            swap(word,leftPointer,rightPointer);
            leftPointer++;
            rightPointer--;
        }

        return String.valueOf(word);
    }
    private void swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}
