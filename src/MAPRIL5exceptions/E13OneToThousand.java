package MAPRIL5exceptions;

import java.util.ArrayList;

public class E13OneToThousand {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <=1000 ; i++) {
            numbers.add(i);
        }
        //System.out.println(numbers);
        for (int number:numbers){
            System.out.println(number);
        }
    }
}
