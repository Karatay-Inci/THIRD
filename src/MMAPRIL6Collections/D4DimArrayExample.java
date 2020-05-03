package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class D4DimArrayExample {
    public static void main(String[] args) {
        ArrayList <ArrayList <Integer> > a = new ArrayList<>();
        System.out.println(a);

        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(b);

        a.add(b);
        System.out.println(a);

        a.add(b);
        System.out.println(a);

        System.out.println(a.get(0).get(2));
    }
}
