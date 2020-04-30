package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class C7ReverseInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> numbersReversed = new ArrayList<>();
        for (int i = numbers.size()-1; i >=0 ; i--) {
            numbersReversed.add(numbers.get(i));
        }
        System.out.println(numbersReversed);
    }
}
