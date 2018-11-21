import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        int startingIndex = 2;
        System.out.println("smallest: " + smallest(values));
        System.out.println("index of the smallest: " + indexOfTheSmallest(values));
        System.out.println("index of the smallest starting from index " + startingIndex +
                ": " + indexOfTheSmallest(values));
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startingIndex) {
        int smallest = array[startingIndex];
        int smallestIndex = startingIndex;

        for(int i = startingIndex; i < array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp;

        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int startingIndex = 0;
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, startingIndex));
            System.out.println(Arrays.toString(array));
            startingIndex++;
        }
    }
}
