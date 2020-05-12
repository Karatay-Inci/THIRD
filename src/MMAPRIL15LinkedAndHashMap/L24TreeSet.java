package MMAPRIL15LinkedAndHashMap;

import java.util.*;

public class L24TreeSet {
    //Create a phonebook with 10 elements     Print them sorted
    public static void main(String[] args) {
        TreeSet<String > phoneBook = new TreeSet<String >(Arrays.asList("Jon Doe :433 333 2383"));
        System.out.println(phoneBook);
        List<String > names = new ArrayList<>(Arrays.asList("Brad Pitt :999 000 8899","Bill Gates : 666 444 3333","James Gosling :373 777 7733"));
        phoneBook.addAll(names);
        System.out.println(phoneBook);

        Iterator<String > iterator = phoneBook.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
