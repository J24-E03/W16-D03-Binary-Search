public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 4, 2};
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int find = findPeak(nums);
        System.out.println("Peak element is at index: " + find);
        System.out.println("Peak element value: " + nums[find]);

        int find1 = findPeak(nums1);
        System.out.println("Peak element is at index: " + find1);
        System.out.println("Peak element value: " + nums1[find1]);

        int find2 = findPeak(nums2);
        System.out.println("Peak element is at index: " + find2);
        System.out.println("Peak element value: " + nums2[find2]);
    }
    public static int findPeak(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right -left)/2;

            if((mid == 0 || nums[mid] >= nums[mid -1]) && (mid == nums.length-1 || nums[mid] >= nums[mid + 1])){
                return mid;
            }
            if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        return -1;

    }

}
