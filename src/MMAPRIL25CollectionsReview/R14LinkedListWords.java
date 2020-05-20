package MMAPRIL25CollectionsReview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class R14LinkedListWords {
    //Create a string LinkedList with at least 5 elements
    //-Write a java program to find the longest word (string)
    //-Write a java program to find the shortest word (string)
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("Java","is","extremely","fun"));
        List<Integer> lenghts = new LinkedList<>();
        for (String word : list){
            lenghts.add(word.length());
        }
        System.out.println(list);
        System.out.println(lenghts);
        int index = lenghts.indexOf(Collections.min(lenghts));
        System.out.println("The shortest word is: "+"\""+list.get(index)+"\""+" with the lenght of "+lenghts.get(index));
        int index1 = lenghts.indexOf(Collections.max(lenghts));
        System.out.println("The longest word is: "+"\""+list.get(index1)+"\""+" with the lenght of "+lenghts.get(index1));
    }
}
