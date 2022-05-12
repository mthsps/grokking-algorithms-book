import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length-1; j >= i; j--) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
       

    public static void main(String[] args) {
        
        int[] myList = {5, 3, 6, 2, 10};

        System.out.println(Arrays.toString(selectionSort(myList)));

    }


}