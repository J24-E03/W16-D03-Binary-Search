package com.omar;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(myNums);

//        best case scenerio: when the arraylist is empty
        myNums.add(0,10);
        System.out.println(myNums);

        int[] arrNums = {1,2,3,4,5,6,7,8};

        for(int i =0; i<arrNums.length; i++){
            arrNums[i] = i+1;
        }



        System.out.println(Arrays.toString(arrNums));


        System.out.println(myNums);

        myNums.remove(myNums.size()-1);

        System.out.println(myNums);

        myNums.remove(0);

        System.out.println(myNums);




















    }

    public static ArrayList<Integer> sortInts(ArrayList<Integer> list){

//        SORTING

        return new ArrayList<>();
    }


}