import java.util.Arrays;

import heapsort.Heapsort;
import mergesort.MergeSort;
import quicksort.Quicksort;
/**
 * @author mkawka
 *
 */
public class Start {
  public static void main(String[] args) {
    int[] arrayToSort = {9,8,7,6,5,4,3,2,1};
    System.out.println("Starting array : " + Arrays.toString(arrayToSort));
    Quicksort quicksort = new Quicksort();
    quicksort.quicksort(arrayToSort, 0, arrayToSort.length - 1);
    System.out.println("Quicksort result:");
    System.out.println(Arrays.toString(arrayToSort));

    int[] arrayToMergesort = {9,8,7,6,5,4,3,2,1};
    MergeSort mergeSort = new MergeSort();
    mergeSort.mergeSort(arrayToMergesort, 0, arrayToMergesort.length - 1);
    System.out.println("Mergesort result:");
    System.out.println(Arrays.toString(arrayToMergesort));
    
    int[] arrayToHeapsort = {9,8,7,6,5,4,3,2,1};
    Heapsort heapsort = new Heapsort();
    heapsort.heapsort(arrayToHeapsort);
    System.out.println("Heapsort result:");
    System.out.println(Arrays.toString(arrayToHeapsort));
  }

}
