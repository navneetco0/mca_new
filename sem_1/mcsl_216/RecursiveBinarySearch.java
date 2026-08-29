class RecursiveBinarySearch {

    static int binarySearch(int[] arr, int low, int high, int key) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        } else {
            return binarySearch(arr, mid + 1, high, key);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 35, 40, 45, 50,
                     55, 60, 65, 70, 100};

        int key = 100;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result != -1) {
            System.out.println("Element " + key +
                    " found at index " + result);
            System.out.println("Position = " + (result + 1));
        } else {
            System.out.println("Element not found");
        }
    }
}