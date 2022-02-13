import java.util.Random;

public class Main{

    int[] unsortedArray;
    int[] sortedArray;

    public Main(int arraySize) {
        createUnsortedArray(arraySize);
    }

    private void createUnsortedArray(int length) {
        Random rand = new Random();
        unsortedArray = new int[length];

        for (int i = 0; i <unsortedArray.length; i++) {
            unsortedArray[i] = rand.nextInt(1000000);
        }
    }

    private void printUnsortedArray() {
        System.out.println("Before:");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }
    }

    private void printSortedArray() {
        System.out.println("After:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }
    public static void main(String[] args) {
        
    }
}