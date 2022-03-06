// Created by Maximilian Müller on 03/06/2022
// Copyright @ 2022 Maximilian Müller. All rights reserved.
// You may use this code for educational or non-comercial purposes only.

public class SelectionSort {

    int[] sortedArray;

    public SelectionSort(int[] unsortedArray) {
        sortedArray = selectionSort(unsortedArray);
    }

    private int[] selectionSort(int[] array) {
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
        CreateUnsortedArray array = new CreateUnsortedArray(10);
        array.printUnsortedArray(array.getUnsortedArray());
        SelectionSort sort = new SelectionSort(array.getUnsortedArray());
        array.printSortedArray(sort.getSortedArray());
    }
}
