package MMAPRIL25CollectionsReview;

import Creating_Classes.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class R2ArrayListRandomNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(50);
        for (int i = 0; i <10 ; i++) {
            list.add((int)(Math.random()*1000));
        }
        System.out.println(list);
        System.out.println("Min Value = "+ Collections.min(list));
        System.out.println("Max Value = "+ Collections.max(list)+"\n");

        Collections.sort(list);
        System.out.println(list+"\n");

        System.out.println("Median = "+list.get(list.size()/2));
        System.out.println("Largest 3 = "+list.get(list.size()-1)+", "+list.get(list.size()-2)+", "+list.get(list.size()-3));
        System.out.println("Minimum 3 = "+list.get(0)+", "+list.get(1)+", "+list.get(2));


    }
}
