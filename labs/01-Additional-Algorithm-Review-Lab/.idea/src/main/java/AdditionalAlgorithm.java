import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class AdditionalAlgorithm {
    public static void main(String[] args) {
        //--------Problem 1
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println(checkDuplicate(nums1)); // Output: true
        System.out.println(checkDuplicate(nums2));

        //---------Problem 2
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";

        System.out.println(isAnagram(s1,t1));
        System.out.println(isAnagram(s2,t2));

        //-------problem3
        String text1 = "nlaebolko";
        String text2 = "loonbalxballpoon";
        String text3 = "leetcode";

        System.out.println(maxNumberOfBalloons(text1));
        System.out.println(maxNumberOfBalloons(text2));
        System.out.println(maxNumberOfBalloons(text3));
    }
    //--------Problem 1
    public static boolean checkDuplicate(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;

    }
    //--------Problem 2
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
    //--------Problem 3
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : text.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        int bCount = count.getOrDefault('b', 0);
        int aCount = count.getOrDefault('a', 0);
        int lCount = count.getOrDefault('l', 0) / 2;
        int oCount = count.getOrDefault('o', 0) / 2;
        int nCount = count.getOrDefault('n', 0);
        return Math.min(Math.min(bCount, aCount), Math.min(Math.min(lCount, oCount), nCount));
    }




    }


