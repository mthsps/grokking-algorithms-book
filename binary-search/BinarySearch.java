public class BinarySearch {
    
    public static int binarySearch(double[] list, int item) {
        int low = 0;
        int high = list.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            double guess = list[mid];

            if (guess == item)
                return mid;

            if (guess > item)
                high = mid - 1;

            else
                low = mid + 1;
            }

        return -1;
    }
    

    public static void main(String[] args) {
        
        double[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3));
        System.out.println(binarySearch(myList, -1));
    }


}