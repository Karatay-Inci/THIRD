package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L3FirstHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> first = new HashMap<>();
        System.out.println(first);
        first.put("Java\t",100);
        System.out.println(first);
        first.put("Selenium",99);
        System.out.println(first);

        System.out.println("\t\t************");

        System.out.println(first.get("Selenium"));
        System.out.println(first.size());

        System.out.println("\t\t************");

        //printing the keys
        for (String key:first.keySet()) {
            System.out.println(key);
        }
        System.out.println("\t\t************");
        //printing values
        for (int values : first.values()) {
            System.out.println(values);
        }
        System.out.println("\t\t************");
        //printing key and values
        for (String key : first.keySet()) {
            System.out.println("Key :"+key+"\t\tValue :"+first.get(key));
        }

    }
}
