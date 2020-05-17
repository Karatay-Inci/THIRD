package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class R3ArrayListDuplicateRemove {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,2,3,4,3,4,2,6,7,8,9));
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println(arrayList+"\n");


        //other way
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,2,21,2,1));
        removeDup(myList);

    }
    public static void removeDup(ArrayList<Integer> arr){
        HashSet<Integer> hs = new HashSet<>();
        for (int number :arr){
            hs.add(number);
        }
        System.out.println(hs);
    }
}


//3.05
