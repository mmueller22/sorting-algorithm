public class BubbleSort {

    private int[] sortedArray;

    public BubbleSort(int[] inputArray) {
        bubbleSort(inputArray);
        sortedArray = inputArray;
    }

    private void bubbleSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < inputArray.length; j++) {
                if(inputArray[j-1] > inputArray[j]) {
                    int biggerNumber = inputArray[j-1];
                    inputArray[j-1] = inputArray[j];
                    inputArray[j] = biggerNumber;
                }
            }
        }
    }

    public int[] getSortedArray() {
        return sortedArray;
    } 

    public static void main(String[] args) {
        CreateUnsortedArray createArray = new CreateUnsortedArray(10);
        createArray.printUnsortedArray(createArray.getUnsortedArray());
        BubbleSort bubbleSort = new BubbleSort(createArray.getUnsortedArray());
        createArray.printSortedArray(bubbleSort.getSortedArray());
    }
}
