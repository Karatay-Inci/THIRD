package MMAPRIL15LinkedAndHashMap;

import java.util.Enumeration;
import java.util.Hashtable;

public class L18RemoveWithiterator {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> numbers = new Hashtable<>();
        for (int i = 0; i < 10; i++) {
            numbers.put(i,i*2);
        }
        System.out.println(numbers);

        Enumeration<Integer> iter = numbers.keys();

        while (iter.hasMoreElements()){
            Integer key= iter.nextElement();
            if (key>7){
                numbers.remove(key);
            }
        }
        System.out.println(numbers);
    }
}
