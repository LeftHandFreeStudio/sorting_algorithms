package heapsort;

/**
 * @author mkawka
 *
 */
public class Heapsort {
  
  public void heapsort(int[] arrayToSort) {
    int arraySize = arrayToSort.length;
    //start with last parent index and iterate down the binary tree through each node
    //always bring the biggest element to the root
    for(int k = arraySize/2 -1; k >= 0; k--) {
      makeHeapMaximal(arrayToSort, arraySize, k);
    }
    
    //iterate over all elements of the heap always switching the last element with root,
    // then remove last element from considered and update the tree
    // > 0 because when there is only one element left we don't have to sort it 
    for(int k = arraySize-1; k > 0; k--) {
      swapArrayElements(arrayToSort, 0, k);
      arraySize --;
      makeHeapMaximal(arrayToSort,arraySize , 0);
    }
  }
  
  private void makeHeapMaximal(int[] heap, int heapSize, int parentIndex) {
    //save considered parent index for further check if change occured
    int maxIndex = parentIndex;
    //get parents childs indexes
    int leftChildIndex = parentIndex *2 +1;
    int rigthChildIndex = parentIndex * 2 + 2;
    //check if parent element is bigger than child element, if not, then switch max index
    if(leftChildIndex < heapSize && heap[maxIndex] < heap[leftChildIndex]) {
      maxIndex = leftChildIndex;
    }
    if(rigthChildIndex < heapSize && heap[maxIndex] < heap[rigthChildIndex]) {
      maxIndex = rigthChildIndex;
    }
    //if parent wasn't biggest element, then place the biggest element in the place of parent
    // afterwards check the heap, because if index has changed, other element also has to be updated
    if(maxIndex != parentIndex) {
      swapArrayElements(heap, maxIndex, parentIndex);
      makeHeapMaximal(heap, heapSize, maxIndex);
    }
  }
  
  private void swapArrayElements(int[] arrayToSwap, int firstIndex, int secondIndex) {
    int temp = arrayToSwap[firstIndex];
    arrayToSwap[firstIndex] = arrayToSwap[secondIndex];
    arrayToSwap[secondIndex] = temp;
  }

}
