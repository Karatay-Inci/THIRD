package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class R13TwoDimStringArrayList {
    //Create 2 dimensional string arrayList and initialize
    //Write a function to find number if uppercase letters in every row
    //Write a function to find number if uppercase letters in every element
    //Write a function to find number if lowercase letters in every row
    public static void main(String[] args) {
        ArrayList<ArrayList<String >> words = new ArrayList<>();
        ArrayList<String > row = new ArrayList<>(Arrays.asList("Java","is","Fun","Always","Java","is","Fun"));
        for (int i = 0; i <5 ; i++) {
            words.add(new ArrayList<>());
            words.get(i).addAll(row);
        }
        for (ArrayList<String > line : words){
            System.out.println(line);
        }
        Iterator<ArrayList<String >> iterator = words.iterator();
        int counter;
        while (iterator.hasNext()){
            counter=0;
            for (String word: iterator.next()){
                for (int i = 0; i <word.length() ; i++) {
                    if (Character.isUpperCase(word.charAt(i))){
                        counter++;
                    }
                }
            }
            System.out.println("Total Upper for this line "+ counter);
        }

    }
}
