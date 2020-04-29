package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class C3ArrayListLoop {
    public static void main(String[] args) {
        ArrayList <Integer> myList = new ArrayList<Integer>(Arrays.asList(3,56,77,7,8));
        myList.add(4);
        myList.add(7);
        myList.add(11);
        myList.remove(0);
       // System.out.println(myList.size());      ---> Output : 3  This mean "number of the elements"

        //Regular For Loop
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.get(i));
        }
        System.out.println();
        //For each Loop
        for (int element:myList) {
            System.out.println(element);
        }
        System.out.println();
        //While Loop
        int index=0;
        while (index<myList.size()){
            System.out.println(myList.get(index));
            index++;
        }


    }
}
