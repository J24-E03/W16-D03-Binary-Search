public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int search = searchInsert(nums,target);
        System.out.println("The index of the target is: " + search);

        int target2 = 2;
        int search2 = searchInsert(nums, target2);
        System.out.println("The index of the target is: " + search2 );

        int target3 = 7;
        int search3 = searchInsert(nums,target3);
        System.out.println("The index of the target is: " + search3);

    }
    //Binary Search Algorithm
    public static int searchInsert(int[] nums, int target){

        //Initialize left and right pointers to the start and end of the array, respectively.
        int left = 0;
        int right = nums.length -1;

    //Loop as long as left is less than or equal to right.
        while(left <= right){
            int mid = left + (right - left) /2; //Find the middle of the current array segment (left + (right - left) / 2).

            //Compare the target with the middle element.
            if(nums[mid] == target){ //If equal, return the middle index (target found).
                return mid;
            }
            if(nums[mid] < target){ //If the target is greater, search the right half (left = mid + 1).
                left = mid + 1;
            } else {
                right = mid - 1; //If the target is less, search the left half (right = mid - 1).
            }

        }
        return  left;
    }

}
