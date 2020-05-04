package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class D6StringArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String >> words = new ArrayList<>();
        ArrayList<String>               a   = new ArrayList<>(Arrays.asList("Java","is","fun"));
        words.add(a);
        words.add(a);
        System.out.println(words);
    }
}
