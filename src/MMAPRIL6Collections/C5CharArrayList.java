package MMAPRIL6Collections;

import java.util.ArrayList;

public class C5CharArrayList {
    public static void main(String[] args) {
        String sentence ="Java is fun";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i <sentence.length() ; i++) {
            chars.add(sentence.charAt(i));
        }
        System.out.println(chars);
    }
}
