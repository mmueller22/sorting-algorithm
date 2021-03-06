// Created by Maximilian Müller on 02/13/2022
// Copyright @ 2022 Maximilian Müller. All rights reserved.
// You may use this code for educational or non-comercial purposes only.

import java.util.Random;

public class CreateUnsortedArray {

    private int[] unsortedArray;

    public CreateUnsortedArray (int arraySize) {
        createUnsortedArray(arraySize);
    }

    private void createUnsortedArray(int length) {
        Random rand = new Random();
        unsortedArray = new int[length];

        for (int i = 0; i <unsortedArray.length; i++) {
            unsortedArray[i] = rand.nextInt(1000000);
        }
    }

    public void printUnsortedArray(int[] unsortedArray) {
        System.out.println("Before:");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }
    }

    public void printSortedArray(int[] sortedArray) {
        System.out.println("After:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    public int[] getUnsortedArray() {
        return unsortedArray;
    }
}