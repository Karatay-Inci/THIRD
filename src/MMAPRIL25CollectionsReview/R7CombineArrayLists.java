package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Arrays;

public class R7CombineArrayLists {
    //Write a java method to combine 2Arraylist
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(4,5,6));
        System.out.println(combineArray(arr1,arr2));

    }
    public static ArrayList<Integer> combineArray(ArrayList<Integer>left, ArrayList<Integer>right){
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
