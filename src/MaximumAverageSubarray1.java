public class MaximumAverageSubarray1 {

    // nums = [1,12,-5,-6,50,3], k = 4
    public double findMaxAverage(int[] nums, int k) {
        int max =0;
        int sum =0;

        // Find first k elements sum
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        // Current max sum of k elements is equals to sum
        max = sum;//2, 51, 42

        // Then calculate rest of the length of k subarrays
        for(int i=k; i<nums.length;i++){
            sum += nums[i] - nums[i-k];//2+50-1, 51+3-12
            max = Math.max(max,sum);
        }

        // Typecasting int to double
        return (double)(max) / k;
    }

}
