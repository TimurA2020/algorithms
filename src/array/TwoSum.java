package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if(numbers.contains(remainder)) {
                return new int[]{numbers.indexOf(remainder), i};
            } else {
                numbers.add(nums[i]);
            }
        }
        return new int[]{};
    }

    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if(integerMap.containsKey(remainder)) {
                return new int[]{integerMap.get(remainder), i};
            } else {
                integerMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static int[] twoSumArray(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
