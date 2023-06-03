package sortingStrategies;

public class Sorter {
    private SortingStrategy sortingStrategy;

    public Sorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int nums[]) {
        sortingStrategy.sort(nums);
    }
}
