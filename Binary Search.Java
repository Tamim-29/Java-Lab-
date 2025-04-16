public class Main {
    /** Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;  // middle element
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;  // target is found
            else
                low = mid + 1;
        }

        return -1; // target not found!
    }

    public static void main(String[] args) {
        int[] myList = {2, 4, 6, 8, 10, 12, 14};  // must be sorted!
        int key = 10;
        int result = binarySearch(myList, key);

        if (result >= 0)
            System.out.println("Key found at index: " + result);
        else
            System.out.println("Key not found in the list.");
    }
}
