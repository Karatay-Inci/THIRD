package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class C19AEIexclusion {
    /*Write a java program to remove from String ArrayList Strings have a,e or i
 Sample input:     abc, sdf,fgh,ert
 Output      :    sdf, fgh                 */
    public static void main(String[] args) {
        ArrayList<String > words = new ArrayList<>(Arrays.asList("abc","def","tyu","iop","fgh"));
        System.out.println(removeSpecial(words));
    }
    public static ArrayList<String > removeSpecial(ArrayList<String > arr){
        ArrayList<String > result = new ArrayList<>();
        for (String word :arr){
            if (!(word.contains("a") || word.contains("e") || word.contains("i")) ){
                result.add(word);
            }
        }
        return result;
    }
}
