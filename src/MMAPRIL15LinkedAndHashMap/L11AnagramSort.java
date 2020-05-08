package MMAPRIL15LinkedAndHashMap;

import java.util.ArrayList;
import java.util.Arrays;

public class L11AnagramSort {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "dcba";
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars1);
        System.out.println(Arrays.toString(chars1));
        Arrays.sort(chars2);
        System.out.println(Arrays.toString(chars2));
        boolean isAnagram = true;
        for (int i = 0; i <chars1.length ; i++) {
            if (chars1[i]!=chars2[i]){
                isAnagram=false;
                break;
            }
        }
        if (isAnagram){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
