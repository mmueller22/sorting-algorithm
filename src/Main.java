public class Main{

    int[] unsortedArray;
    int[] sortedArray;

    public Main(int arraySize) {
        createUnsortedArray(arraySize);
    }

    private void createUnsortedArray(int length) {
        unsortedArray = new int[length];
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