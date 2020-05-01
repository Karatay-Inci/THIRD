package MMAPRIL6Collections;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C9ItemRemovingQ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Java","SQL","HTML","CSS","SELENIUM"));   //How  can I add chatAt.
        System.out.println(myList);
        System.out.print("Enter item to remove :");
        String item = scn.next();
        ArrayList<String > newList = new ArrayList<>();
        for (String element : myList){
            if (!element.equals(item)){
                newList.add(element);
            }
        }
        System.out.println(newList);
    }
}
