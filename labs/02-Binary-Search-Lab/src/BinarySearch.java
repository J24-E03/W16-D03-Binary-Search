public class BinarySearch {
    public static void main(String[] args) {
        // Task 1
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsertPosition(new int[]{5}, 5));
        System.out.println(searchInsertPosition(new int[]{5}, 2));
        System.out.println(searchInsertPosition(new int[]{10, 20, 30, 40}, 5));
        System.out.println(searchInsertPosition(new int[]{10, 20, 30, 40}, 50));

        // Task 2
        System.out.println(findPeakElement(new int[]{1, 3, 5, 6, 4, 2}));
        System.out.println(findPeakElement(new int[]{1, 2, 3, 1}));
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
        System.out.println(findPeakElement(new int[]{1, 3, 5, 7, 8, 6, 4}));
    }

    private static int searchInsertPosition(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (array[middle] == target)
                return middle;
            else if (array[middle] < target)
                start = middle + 1;
            else
                end = middle - 1;
        }

        return end + 1;
    }

    private static int findPeakElement(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (array[mid] > array[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}