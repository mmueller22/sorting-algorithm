// Created by Maximilian Müller on 03/06/2022
// Copyright @ 2022 Maximilian Müller. All rights reserved.
// You may use this code for educational or non-comercial purposes only.

public class InsertionSort {

    int[] sortedArray;

    public InsertionSort(int[] unsortedArray) {
        sortedArray = insertionSort(unsortedArray);
    }

    private int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = array[i];
            int tempIdx = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < smallest) {
                    smallest = array[j];
                    tempIdx = j;
                }
            }
            int temp = array[i];
            array[i] = smallest;
            array[tempIdx] = temp;

        }
        return array;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public static void main(String[] args) {
        CreateUnsortedArray array = new CreateUnsortedArray(100);
        array.printUnsortedArray(array.getUnsortedArray());
        InsertionSort sort = new InsertionSort(array.getUnsortedArray());
        array.printSortedArray(sort.getSortedArray());
    }
}
