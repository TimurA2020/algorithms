package sortingStrategies;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int nums[] = new int[]{3, 1, 42, -34, 23, 9, 6, 1, 31, -4};
        SortingStrategy sortingStrategy = new MergeSort();
        Sorter sorter = new Sorter(sortingStrategy);
        sorter.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
