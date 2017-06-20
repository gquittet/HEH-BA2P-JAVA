import java.util.Arrays;

public class MergeSortAlgo implements ISortAlgo {

    @Override
    public void trier(int[] tab) {
	Arrays.parallelSort(tab);
    }
}
