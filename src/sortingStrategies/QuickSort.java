package sortingStrategies;

public class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int low, int high) {

        if(low >= high) {
            return;
        }

        int pivot = nums[high];

        int left = low;
        int right = high;

        while (left < right) {

            while(nums[left] <= pivot && left < right) {
                left++;
            }

            while(nums[right] >= pivot && left < right) {
                right--;
            }

            swap(nums, left, right);
        }

        swap(nums, left, high);

        sort(nums, low, left - 1);
        sort(nums, left + 1, high);

    }

    private void swap(int nums[], int a, int b) {
        int buffer = nums[a];
        nums[a] = nums[b];
        nums[b] = buffer;
    }

}
