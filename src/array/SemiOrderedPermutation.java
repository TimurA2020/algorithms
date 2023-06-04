package array;

import java.util.Arrays;
import java.util.OptionalInt;

public class SemiOrderedPermutation {

    public static void main(String[] args) {
        int nums[] = new int[]{1, 3, 4, 2, 5};

        System.out.println(semiOrderedPermutation(nums));
    }

    public static int semiOrderedPermutation(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && i != 0) {
                for (int j = i; j > 0; j--) {
                    int buffer = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = buffer;
                    count++;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == max && i != nums.length - 1) {
                for (int j = i; j < nums.length - 1; j++) {
                    int buffer = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = buffer;
                    count++;
                }
            }
        }
        return count;
    }
}
