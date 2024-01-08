public class MoveZeroes {

    // 1 ms runtime - 44.88 memory (100% , %80)
    // moving every non-zero to insertIndex then remaining spots must be zero so we fill them with 0
    /*public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <=1){return;}

        int insertIndex = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        while(insertIndex < nums.length){
            nums[insertIndex++]=0;
        }
    }*/

    // 2 ms runtime - 45.08 memory
    /*public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int lastNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, lastNonZeroIndex++, i);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }*/
}
