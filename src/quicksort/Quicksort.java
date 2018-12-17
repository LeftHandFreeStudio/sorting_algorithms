package quicksort;

/**
 * @author mkawka
 *
 */
public class Quicksort {
  
  public void quicksort(int[] arrayToSort, int p, int q) {
    if(p < q) {
      int pivot = partition(arrayToSort,p,q);
      quicksort(arrayToSort, p, pivot -1);
      quicksort(arrayToSort, pivot +1 , q);
    }
    
  }
  public int partition(int[] array, int startIndex, int endIndex) {
    int middleBound = startIndex;
    for(int j = startIndex; j < endIndex; j++){
        if(array[j] <= array[endIndex]){
            swap(array, j,middleBound);
            middleBound++;
        }
    }
    swap(array,middleBound,endIndex);
    return middleBound;
  }
  
  private void swap(int[] arrayToSwap, int firstIndex, int secondIndex) {
    int temp = arrayToSwap[firstIndex];
    arrayToSwap[firstIndex] = arrayToSwap[secondIndex];
    arrayToSwap[secondIndex] = temp;
  }

}
