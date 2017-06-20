public class Main {

    public static void main(String[] args) {
	int[] tabATrier = { 20, 30, 15, 5, 25 };

	ContextAlgo algo = new ContextAlgo();
	algo.trier(tabATrier);
	System.out.println("-- Tableau trié à l'aide de l'algorithme QuickSort --");
	for (int i = 0; i < tabATrier.length; i++) {
	    System.out.print(tabATrier[i] + " ");
	}
	System.out.println("");


	algo.setAlgo(new MergeSortAlgo());
	algo.trier(tabATrier);
	System.out.println("-- Tableau trié à l'aide de l'algorithme MergeSort --");
	for (int i = 0; i < tabATrier.length; i++) {
	    System.out.print(tabATrier[i] + " ");
	}
	System.out.println("");
    }
}
