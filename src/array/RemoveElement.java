package array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
