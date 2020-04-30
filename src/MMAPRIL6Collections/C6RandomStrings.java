package MMAPRIL6Collections;

import java.util.ArrayList;

public class C6RandomStrings {
    public static void main(String[] args) {
        String letters="abcdefghijklmnopqrstvuyz";
        ArrayList<String> words = new ArrayList<>();        //Empty String ArrayList
        String word;
        for (int i = 0; i <50 ; i++) {
            word="";
            for (int j = 0; j <5 ; j++) {           //to concat.chars
                word += letters.charAt((int)(Math.random()*letters.length()));
            }
            words.add(word);
        }
        System.out.println(words);

    }
}
