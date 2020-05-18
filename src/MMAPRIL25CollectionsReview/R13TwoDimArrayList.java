package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class R13TwoDimArrayList {
    //Create 2 dimensional integer Array list
    //Add first Array list then add second Array list --->print all elements
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        int num1=1;
        for (int i = 0; i <5 ; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(num1);
                num1++;
            }
        }
        System.out.println(list);
        for (ArrayList<Integer> sublist : list){
            for (int num2 :sublist){
                System.out.print(" "+num2+"  ");
            }
        }
        Iterator<ArrayList<Integer>> iter = list.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next());
        }
    }
}
