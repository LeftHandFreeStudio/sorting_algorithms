/* Copyright 2018 objective partner AG, all rights reserved */
package mergesort;

import java.util.Arrays;

/**
 * @author mkawka
 *
 */
public class MergeSort {
  
  public void mergeSort(int[] arrayToSort, int startIndex, int endIndex) {
    if(startIndex < endIndex) {
      int middleIndex = (startIndex+endIndex)/2;
      mergeSort(arrayToSort, startIndex, middleIndex);
      mergeSort(arrayToSort, middleIndex + 1, endIndex);
      merge(arrayToSort, startIndex, endIndex, middleIndex);
    }
  }
  
  public void merge(int[] arrayToSort, int startIndex, int endIndex, int middleIndex) {
    int[] lowHalf = new int[middleIndex - startIndex + 1];
    int[] highHalf = new int[endIndex - middleIndex];
    int mainIndex = startIndex;
    System.out.println("MiddleIndex " +  middleIndex);
    System.out.println(lowHalf.length);
    System.out.println(highHalf.length);
    for(int k = 0; k < lowHalf.length;k++) {
      lowHalf[k] = arrayToSort[mainIndex];
      mainIndex++;
    }
    for(int k = 0; k < highHalf.length;k++) {
      highHalf[k] = arrayToSort[mainIndex];
      mainIndex++;
    }
    System.out.println("Low half " +  Arrays.toString(lowHalf));
    System.out.println("High half " +  Arrays.toString(highHalf));
    
    mainIndex = startIndex;
    int firstIndex = 0;
    int secondIndex = 0;
    while(firstIndex < lowHalf.length && secondIndex < highHalf.length) {
      if(lowHalf[firstIndex] < highHalf[secondIndex]) {
        arrayToSort[mainIndex] = lowHalf[firstIndex];
        firstIndex ++;
      }else{
        arrayToSort[mainIndex] = highHalf[secondIndex];
        secondIndex ++;
      }
      System.out.println("inserted " +  arrayToSort[mainIndex]);
      mainIndex++;
    }
    
    while(firstIndex < lowHalf.length) {
      arrayToSort[mainIndex] = lowHalf[firstIndex];
      System.out.println("inserted lh " +  arrayToSort[mainIndex]);
      mainIndex++;
      firstIndex++;
    }
    while(secondIndex < highHalf.length) {
      arrayToSort[mainIndex] = highHalf[secondIndex];
      System.out.println("inserted hh " +  arrayToSort[mainIndex]);
      mainIndex++;
      secondIndex++;
    }
    System.out.println("After merge " +  Arrays.toString(arrayToSort));
    
  }

}
