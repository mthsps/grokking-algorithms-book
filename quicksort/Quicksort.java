import java.util.Arrays;

public class Quicksort {

    static int divide(int[] array, int low, int high) {

    int pivot = array[high];

    int i = (low - 1);
    for (int j = low; j < high; j++) {
        if (array[j] <= pivot) {
            i++;

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return (i + 1);
}

    static void quicksort(int[] array, int low, int high) {
        if (low < high) {

            int pi = divide(array, low, high);

            quicksort(array, low, pi -1);
            quicksort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] array = {10, 5, 2, 3, 0, 7, -1};

        int size = array.length;

        quicksort(array, 0, size - 1);

        System.out.println(Arrays.toString(array));
        
    }    
}
