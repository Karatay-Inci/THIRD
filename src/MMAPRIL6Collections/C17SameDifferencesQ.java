package MMAPRIL6Collections;

import java.util.ArrayList;
/*
 For given Integer Array list find the same differences (absolute) with 2 elements
 Input:    2,4,6
 Possible differences  2-4 ,2-6,4-6
 Output:   2                  */


public class C17SameDifferencesQ {
    public static void main(String[] args) {
        int myNums[] ={6,6,6,6,6,6,8,12,20};
        System.out.println(findSameDifferences(myNums));
    }
    public static ArrayList<Integer> findSameDifferences(int[] arr){
        ArrayList<Integer> diffs= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                diffs.add(Math.abs(arr[i]-arr[j]));
            }
        }
        diffs = findDublicates(diffs);
        return diffs;
    }
    public static ArrayList<Integer> findDublicates(ArrayList<Integer> arr){
        ArrayList<Integer> dublicates = new ArrayList<>();
        for (int i = 0; i <arr.size() ; i++) {
            for (int j = i+1; j <arr.size() ; j++) {
                if (arr.get(i).equals(arr.get(j))  && !dublicates.contains(arr.get(i))){
                    dublicates.add(arr.get(i));
                }
            }
        }
        return dublicates;
    }
}
