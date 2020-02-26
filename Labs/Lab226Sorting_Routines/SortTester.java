import java.util.*;
/**
 * SortTester Class
 *
 * @author (Emily Greene)
 * @version (1024)
 */
public class SortTester
{
    ArrayList<Integer> numList = new ArrayList<Integer>();
    int[] nums = new int[10];
    int compares;
    int swaps;
    public SortTester()
    {
        //BubbleSort results
        loadNumbers(10);
        System.out.println("BubbleSort original array:");
        printList();
        bubbleSort();
        printList();
        //InsertSort results
        loadNumbers(10);
        System.out.println("\n InsertSort original array:");
        printList();
        insertSort();
        printList();
        //SelectionSort results
        loadNumbers(10);
        System.out.println("\n SelectSort original array:");
        printList();
        selectSort();
        printList();
        //MergeSort results
        
        
    }
    public static void main(){
        SortTester sort = new SortTester();
    }
    //loads arraylist with numbers between 1 and 100
    public void loadNumbers(int n){
        numList.clear();
        for(int i = 0; i < n; i++){
            int random = (int)((Math.random()*100)+1);
            numList.add(random);
        }
    }
    //bubble sort code
    public void bubbleSort(){
        compares = 0;
        swaps = 0;
        for(int i = numList.size()-1; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                compares += 1;
                if(numList.get(j-1) > numList.get(j)){
                    swap(j-1, j);
                    swaps += 1;
                }
            }
        }
        System.out.println("BubbleSort number of compares: " + compares);
        System.out.println("BubbleSort number of swaps: " + swaps);
    }
    //insert sort code
    public void insertSort(){
        compares = 0;
        swaps = 0;
        for(int i = 1; i < numList.size(); i++){
            int j = i;
            while(j > 0 && numList.get(j) < numList.get(j-1)){
                swap(j, j-1);
                swaps +=1;
                compares +=1;
                j = j-1;
            }
            compares += 1;
        }
        System.out.println("InsertSort number of compares: " + compares);
        System.out.println("InsertSort number of swaps: " + swaps);
    }
    //select sort code
    public void selectSort(){
        compares = 0;
        swaps = 0;
        for(int i = 0; i < numList.size() - 1; i++){
            int index = i;
            for(int j = i + 1; j < numList.size(); j++){
                if(numList.get(j) < numList.get(index)){
                    index = j;
                }
                compares += 1;
            }
            swap(index, i);
            swaps += 1;
        }
        System.out.println("SelectSort number of compares: " + compares);
        System.out.println("SelectSort number of swaps: " + swaps);
    }
    
    public void mergeSort(int[] a){
        if(a.length < 2){
            return;
        }
        int mid = a.length/2;
        int[] l = new int[mid];
        int[] r = new int[a.length - mid];
    }
    //swapping code
    public void swap(int i, int n){
        int temp = numList.get(i);
        numList.set(i, numList.get(n));
        numList.set(n, temp);
    }
    //prints the arraylist
    public void printList(){
        System.out.println(numList);
    }
    
}
