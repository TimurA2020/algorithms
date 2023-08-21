package array;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int globalCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 0;
            }
            if (count <= 1) {
                nums[globalCount] = nums[i];
                globalCount++;
            }
        }

        return globalCount;
    }
}
