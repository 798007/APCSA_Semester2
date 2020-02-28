
/**
 * Write a description of class MergeSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSorter extends Sorter
{
    /**
     * Constructor for objects of class MergeSorter
     */
    public MergeSorter()
    {
        super();
    }

    public void sort(int[] a){
        if(less(a.length, 2)){
            return;
        }
        int mid = a.length/2;
        int[] l = allocateTempArray(mid);
        int[] r = allocateTempArray(a.length - mid);
        for(int i = 0; less(i, mid); i++){
            moveValue(l, i, a[i]);
        }
        for(int i = mid; less(i, a.length); i++){
            moveValue(r, i - mid, a[i]);
        }
        sort(l);
        sort(r);
        merge(a, l, r, mid, a.length - mid);
    }
    
    public void merge(int[] a, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while(less(i, left) && less(j, right)){
            if(lessEqual(l[i], r[j])){
                moveValue(a, k++, l[i++]);
            }else{
                moveValue(a, k++, r[j++]);
            }
        }
        while(less(i, left)){
            moveValue(a, k++, l[i++]);
        }
        while(less(j, right)){
            moveValue(a, k++, r[j++]);
        }
    }
}
