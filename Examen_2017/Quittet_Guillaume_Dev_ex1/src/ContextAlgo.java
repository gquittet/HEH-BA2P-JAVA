public class ContextAlgo {

    private ISortAlgo iSortAlgo;

    public ContextAlgo() {
	iSortAlgo = new QuickSortAlgo();
    }

    public void setAlgo(ISortAlgo algo) {
	this.iSortAlgo = algo;
    }

    public void trier(int[] tab) {
	iSortAlgo.trier(tab);
    }
}
