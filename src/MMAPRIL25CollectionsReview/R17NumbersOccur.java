package MMAPRIL25CollectionsReview;

import java.util.HashMap;

public class R17NumbersOccur {
    //Write a java program to count number of occurences of every element for given array
    public static void main(String[] args) {
            int arr[] = {1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5};
            System.out.println(findOccur(arr));
    }
    public static HashMap<Integer,Integer> findOccur(int [] arr){
            HashMap<Integer,Integer> result = new HashMap<>();
            for (int num : arr){
                if (result.containsKey(num)) {
                    result.put(num, result.get(num) + 1);
                }
                else {
                    result.put(num,1);
                }
            }
            return result;
    }
}
