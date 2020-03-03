
/**
 * Write a description of class InsertionSorter here.
 *
 * @author (Emily Greene)
 * @version (303)
 */
public class InsertionSorter extends Sorter
{
    public InsertionSorter() {
        super();
    }

    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while(j > 0 && less(a[j], a[j-1])){
                swap(a, j, j-1);
                j = j-1;
            }
        }
    }

}
