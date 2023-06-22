package array;

public class SignOfTheProduct {

    public static int arraySign(int[] nums) {
        int minusCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                return 0;
            } else if(nums[i] < 0) {
                minusCount++;
            }
        }

        return minusCount % 2 == 0 ? 1 : -1;
    }
}
