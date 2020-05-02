package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class C18 {
    /*Write a java program to shift left number of elements
    Sample input
                    1,2,3,4,5
                           Shift(2)
    Output
                     3,4,5*/
    public static void main(String[] args) {
        int [] myArr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(removeFromStart(myArr,5)));
        int [] abc={};
        removeFromStart(abc,3);
    }
    public static int[] removeFromStart(int[] arr, int numberOfElements){
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length>0){
            for (int i = numberOfElements; i <arr.length ; i++) {
                result.add(arr[i]);
            }
        }
        else{
            System.out.println(" It is empty array");
        }
          int[] realResult = new int [result.size()];
        int index = 0;
        for (int num : result){
            realResult[index]=num;
            index++;
        }
        return realResult;
    }
}