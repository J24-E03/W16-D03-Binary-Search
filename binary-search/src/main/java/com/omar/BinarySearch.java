package com.omar;

public class BinarySearch {
    public static void main(String[] args) {

        int[] inputArr = {1,3,4,6,8,11,20,33,40,50,67};
        int targetValue = 5;

        System.out.println(binarySearchOptimal(inputArr,targetValue));

        System.out.println((2+2147483647)/2);
        System.out.println(2+ (2147483647-2)/2);

    }

//    problem: given an array of integers and a target integer, return the index of where the target is in the array
//    if the array doesn't contain the number then return -1
    public static int findTargetElement(int[] arr, int target){

        for(int i =0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchOptimal(int[] arr, int target){

        int left = 0;

        int right = arr.length-1;


//        cutting in half my arr functionality
        while(left<right){

//            calculate the midpoint
            int mid = left + (right -left)/2;


//            scenerio 1: midpoint is equal to target
            if(arr[mid] == target){
                return mid;
            }
//            scenerio 2: if the midpoint is less than the target
            else if(arr[mid] < target){
                left = mid +1;
            }
//            scenerio 3: if the midpoint is greater than the target
            else{
                right = mid -1;
            }
        }
        return -1;
    }
}
