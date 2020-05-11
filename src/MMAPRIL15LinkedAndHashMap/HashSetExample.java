package MMAPRIL15LinkedAndHashMap;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        System.out.println(numbers);
        numbers.add(2);
        System.out.println(numbers);
        numbers.add(2);
        System.out.println(numbers);
        numbers.add(1);
        System.out.println(numbers);
    }
}
