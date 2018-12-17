import java.util.Arrays;

import quicksort.Quicksort;
/**
 * @author mkawka
 *
 */
public class Start {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int[] arrayToSort = {9,8,7,6,5,4,3,2,1};
    Quicksort quicksort = new Quicksort();
    quicksort.quicksort(arrayToSort, 0, arrayToSort.length - 1);
    System.out.println(Arrays.toString(arrayToSort));
  }

}
