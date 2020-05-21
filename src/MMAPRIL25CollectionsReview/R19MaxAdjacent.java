package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class R19MaxAdjacent {
    //Write a java program to find max multiplication of adjacent values of the integer array.
    //Return index and values
    public static void main(String[] args) {
        int arr [] = {1,2,3,5,2,4};     //1*2  2*3  3*5  5*2  2*4   --->Index 2->3*5   (max)
        findMaxAdjacent(arr);           // 2    6    15  10    8    --->Index 2->15

    }public static void findMaxAdjacent(int arr[]){
        List<Integer> multiplies = new ArrayList<>();
        for (int i = 0; i <arr.length-1; i++) {
            multiplies.add(arr[i]*arr[i+1]);
        }
        System.out.println(multiplies);
        int max = Collections.max(multiplies);
        int index = multiplies.indexOf(max);
        System.out.println(index);
        System.out.println("index 1:\t"+index+"\t value\t"+arr[index]);
        System.out.println("index 2:\t"+(index+1)+"\t value\t"+arr[index+1]);
        System.out.println("Max multiplication:"+(arr[index]*arr[index+1]));
    }
}
