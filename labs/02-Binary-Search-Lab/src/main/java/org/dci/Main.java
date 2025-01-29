package org.dci;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SearchInsertPosition();
        findPeakElement();
    }

    private static void SearchInsertPosition() {
        int[] nums = {1, 3, 5, 6};

        System.out.println("Array of numbers: " + Arrays.toString(nums));
        System.out.println("Searching for " + 5 + " int the array -> index: " + searchInsert(nums, 5));
        System.out.println("Searching for " + 2 + " int the array -> index: " + searchInsert(nums, 2));
        System.out.println("Searching for " + 7 + " int the array -> index: " + searchInsert(nums, 7));
    }

    private static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private static void findPeakElement() {

        int[] nums1 = {1, 3, 7, 8, 6, 4, 2};
        System.out.println("\nArray: " + Arrays.toString(nums1));
        System.out.println("Peak Element Index: " + returnPeakElement(nums1));

        int[] nums2 = {1, 2, 3, 4, 5, 6, 4, 2};
        System.out.println("\nArray: " + Arrays.toString(nums2));
        System.out.println("Peak Element Index: " + returnPeakElement(nums2));

        int[] nums3 = {1, 2, 3, 1};
        System.out.println("\nArray: " + Arrays.toString(nums3));
        System.out.println("Peak Element Index: " + returnPeakElement(nums3));
    }

    private static int returnPeakElement(int[] numbers) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] < numbers[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}