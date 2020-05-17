package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R5ArrayListSecondOccurenceQQ {
    //Write a java method to remove given string in string arraylist
    public static void main(String[] args) {
        List<String > list = new ArrayList<>(Arrays.asList("Java","is","fun","Java","yes","Java","Java","Java"));
        int counter =0;
        int index=0;
        for (int i = 0; i <list.size() ; i++) {
            System.out.print("Compare "+"\""+list.get(i)+"\""+" with :");
            for (int j = i+1; j < list.size(); j++) {
                System.out.print(list.get(j)+"\t");
                if (list.get(i).equals(list.get(j))){
                    counter++;
                    if (counter==2){
                        index =j;
                    }
                }
            }
            System.out.println();
        }
        System.out.println(index);
        list.remove(index);
        System.out.println(list);
    }
}
