package sortingStrategies;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(int[] nums) {
        int length = nums.length;
        if (length < 2){
            return;
        }

        int mid = length / 2;
        int lefthalf[] = new int[mid];
        int righthalf[] = new int[length - mid];

        for (int i = 0; i < mid; i++){
            lefthalf[i] = nums[i];
        }

        for(int i = mid; i < length; i++){
            righthalf[i - mid] = nums[i];
        }

        sort(lefthalf);

        sort(righthalf);

        merge(nums, lefthalf, righthalf);
    }

    private void merge (int[] nums, int lefthalf[], int righthalf[]){
        int leftLength = lefthalf.length;
        int rightLength = righthalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftLength && j < rightLength){
            if(lefthalf[i] < righthalf[j]){
                nums[k] = lefthalf[i];
                i++;
            }else{
                nums[k] = righthalf[j];
                j++;
            }
            k++;
        }

        while(i < leftLength){
            nums[k] = lefthalf[i];
            k++;
            i++;
        }

        while(j < rightLength){
            nums[k] = righthalf[j];
            j++;
            k++;
        }
    }
}
