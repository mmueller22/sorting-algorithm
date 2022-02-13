// Created by Maximilian Müller on 02/13/2022
// Copyright @ 2022 Maximilian Müller. All rights reserved.
// You may use this code for educational or non-comercial purposes only.

public class MergeSort {

    private int[] sortedArray;

    public MergeSort(int[] inputArray) {
        mergeSort(inputArray);
        sortedArray = inputArray;
    }

    private void mergeSort(int[] inputArray) {

        int arrayLength = inputArray.length;
    
        if (inputArray.length < 2) {
            return;
        }
    
        int midIndex = inputArray.length / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[arrayLength - midIndex];
    
        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = inputArray[i];
            
        }
        for (int i = midIndex; i < arrayLength; i++) {
            rightArray[i - midIndex] = inputArray[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
    
        merge(inputArray, leftArray, rightArray);
    }
    
    private void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArraySize) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArraySize) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public static void main(String[] args) {
        CreateUnsortedArray createArray = new CreateUnsortedArray(10);
        createArray.printUnsortedArray(createArray.getUnsortedArray());
        MergeSort mergeSort = new MergeSort(createArray.getUnsortedArray());
        createArray.printSortedArray(mergeSort.getSortedArray());
    }
}
