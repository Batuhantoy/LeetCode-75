public class StringCompression {

    public int compress(char[] chars) {
        // index of current place to set char
        int ans = 0;
        for(int i =0; i<chars.length;){
            //character to count
            char letter = chars[i];
            int count = 0;
            while(i<chars.length && letter==chars[i]){ //
                count++;
                i++;
            }
            chars[ans++] = letter;//after counted we set the chars[ans] to the counted letter then below numbers
            if(count > 1){
                // for case if count is two digits we take the char array of count and add them to chars[ans]
                for(char c : String.valueOf(count).toCharArray()){
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }
}
