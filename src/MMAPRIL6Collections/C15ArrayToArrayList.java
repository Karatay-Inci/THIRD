package MMAPRIL6Collections;

import java.util.ArrayList;

public class C15ArrayToArrayList {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(convertToArraylist(arr));
    }
    public static ArrayList<Integer> convertToArraylist(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int element:arr){
            result.add(element);
        }
        return result;
    }
}
