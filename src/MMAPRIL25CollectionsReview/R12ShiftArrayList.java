package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.List;

public class R12ShiftArrayList {
    //Write a java program to shift left number of elements
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        System.out.println(shiftRight(list,0));
        System.out.println(shiftRight(list,1));
        System.out.println(shiftRight(list,1));
        System.out.println(shiftRight(list,1));
        System.out.println(shiftRight(list,1));
        System.out.println(shiftRight(list,1));
        System.out.println(shiftRight(list,1));
    }
    public static ArrayList<Integer> shiftRight(ArrayList<Integer> arr,int shift){
        for (int i = 0; i < shift ; i++) {
            arr.remove(0);
        }
        return arr;
    }
}
