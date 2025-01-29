package com.omar.homework;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-10,-30,-50,1};
//        System.out.println(findBiggestNumInArray(nums));

        int closest = -10;
        int num = 10;

        System.out.println(findNumberClosestToZero(nums));

        System.out.println(isSubsequence("acef","eabcdfs"));


    }

    public static int findNumberClosestToZero(int[] nums){

        int closest = Integer.MAX_VALUE;

        for(int num : nums){

            if(Math.abs(num) < Math.abs(closest)){

                closest = num;
            }

            if(Math.abs(num) == Math.abs(closest) && num >closest){
                closest = num;
            }
        }

        return closest;
    }

    public static int findBiggestNumInArray(int[] nums){
        int biggestNumber = Integer.MIN_VALUE;
        for(int num: nums){
            if(num>biggestNumber){
                biggestNumber=num;
            }
        }
        return biggestNumber;
    }


    public static boolean isSubsequence(String s, String t){

        int sIndex = 0;

        int tindex = 0;

        while(sIndex < s.length() && tindex < t.length()){

            if(s.charAt(sIndex) == t.charAt(tindex)){
                sIndex++;
            }


            tindex++;
        }
        return sIndex == s.length();
    }
}
