package MMAPRIL25CollectionsReview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class R14LinkedListNumbers {
    //-Write a java program to find total of the numbers in the LinkedList
    public static void main(String[] args) {
        List<String > list = new LinkedList<>(Arrays.asList("Java 8","HTML 5","Oracle 9"));
        int total=0;
        String x ="";
        for (String str : list){
            for (int i = 0; i <str.length() ; i++) {
                if (Character.isDigit(str.charAt(i))){
                    x = x + str.charAt(i);
                    System.out.println(x);
                    total = total +Integer.parseInt(x);
                }
                x ="";
            }
        }
        System.out.println("Total : "+total);
    }
}
