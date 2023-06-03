package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 2 + random.nextInt(98);
        int nums[] = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 2 + random.nextInt(98);
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(findDuplicateInnerLoop(nums));
    }


    public static int findDuplicate(int[] nums) {

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            integerSet.add(nums[i]);

            if(integerSet.size() < i + 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int findDuplicateBySorting(int nums[]) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }

        return -1;
    }

    public static int findDuplicateInnerLoop(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}
