package sortingStrategies;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int nums[]) {
        boolean swapped = true;
        int buffer;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if(nums[i] > nums[i + 1]) {
                    swapped = true;
                    buffer = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = buffer;
                }
            }
        }
    }
}
