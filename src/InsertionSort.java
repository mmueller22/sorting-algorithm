// Created by Maximilian Müller on 03/06/2022
// Copyright @ 2022 Maximilian Müller. All rights reserved.
// You may use this code for educational or non-comercial purposes only.

public class InsertionSort {

    int[] sortedArray;

    public InsertionSort(int[] unsortedArray) {
        sortedArray = insertionSort(unsortedArray);
    }

    private int[] insertionSort(int[] array) {
        int key, j;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public static void main(String[] args) {
        CreateUnsortedArray array = new CreateUnsortedArray(10);
        array.printUnsortedArray(array.getUnsortedArray());
        InsertionSort sort = new InsertionSort(array.getUnsortedArray());
        array.printSortedArray(sort.getSortedArray());
    }
}
