package com.example.demo.Q1;

public class BinarySearch {
    public int binarySearch(int[] numbers,int numberToSearchFor){

        BubbleSortAlgorithm bubbleSortAlgorithm=new BubbleSortAlgorithm();
        int[] sortednum=bubbleSortAlgorithm.sort(numbers);


        //Implementing Sorting Logic just a Dummy code
        //this BinarySearch algorithm is Tightly coupled with Bubble Sort which is present here
        // and thats not good because after a long time many sorting arives and switching will be difficultly.


        return 3;


    }



}
