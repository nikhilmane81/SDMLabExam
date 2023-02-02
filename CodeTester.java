public class CodeTester {

    public static int linearSearch(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int left, int right, int num) {

        if (right >= left) {
            int mid = left + (right - left) / 2;
            // if the element found at the mid
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] > num) {
                return binarySearch(arr, left, mid - 1, num);
            } else {
                return binarySearch(arr, mid + 1, right, num);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 10, 20, 30, 40, 50, 60, 45, 85, 47 };
        // int index = linearSearch(arr, 50);
        // if (index == -1) {
        // System.out.println("Element not found");
        // } else {
        // System.out.println("Element found at index " + index);
        // }
        // sorted arr need for binary search

        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int element = binarySearch(arr, 0, arr.length - 1, 30);
        if (element == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found " + element);
        }
    }
}