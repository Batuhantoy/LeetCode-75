public class FindPivotIndex {

    // 1 ms - 44.02 MB
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftSum== (sum-leftSum-nums[i])){return i;}
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(-(-5));
    }
}
