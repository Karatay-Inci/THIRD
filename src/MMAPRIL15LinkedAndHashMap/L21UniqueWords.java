package MMAPRIL15LinkedAndHashMap;

import java.util.Arrays;
import java.util.HashSet;

public class L21UniqueWords {
    //Find the distinct words in a given sentence
    //  Input "java is java"
    //  Output Java , is
    public static void main(String[] args) {
        String sentence ="can a fish fish a fish in a fish can";
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        HashSet<String > distinctWords = new HashSet<>();

        // Now lets add to HashSet

        for (String word : words){
            distinctWords.add(word);
            System.out.println(distinctWords);
        }
        System.out.println(distinctWords);
    }
}
