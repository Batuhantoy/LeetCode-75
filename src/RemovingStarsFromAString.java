public class RemovingStarsFromAString {

    // 9 ms runtime - 43.90 mb memory usage
    /*public String removeStars(String s) {
        char[] newString = new char[s.length()];
        int nextIndex = 0;
        for(char c : s.toCharArray()){
            if(c == '*'){
                if(nextIndex > 0){
                    nextIndex--;
                }
            }else{
                newString[nextIndex] = c;
                nextIndex++;
            }
        }
        return new String(newString,0,nextIndex);
    }*/

    // 29 ms runtime - 44.40 mb memory usage
    /*public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '*'){
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }*/

    // 90 ms runtime - 50.36 mb memory usage
   /*public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.stream().map(String::valueOf).collect(Collectors.joining(""));
    }*/

}
