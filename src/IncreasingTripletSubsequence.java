public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        int s = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        if(nums.length<3){return false;}
        for(int n : nums){
            if(n<=s){
                s=n;
            }else if(n<=b){
                b=n;
            }else{
                System.gc();
                return true;
            }
        }
        return false;
    }
}
