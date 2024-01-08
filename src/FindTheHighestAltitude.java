public class FindTheHighestAltitude {

    public static void main(String[] args) {
        //System.out.println((-7) - (0));
        System.out.println(6 & 5);
    }
    // Runtime 0 ms - Memory 40.9 MB
    // We track altitude sum then comparing with current answer
    public int largestAltitude(int[] gain) {
        int sum = 0,ans=0;

        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
