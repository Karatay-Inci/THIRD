package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kahoot3Q {
    public static void main(String[] args) {
        HashMap<Character,Character> hm = new HashMap<>(10);
        String a ="aabb";
        char x;
        for (int i = 0; i <a.length() ; i++) {
            x=a.charAt(i);
            x++;
            hm.put(a.charAt(i),x);
        }
        Iterator hmIterator = hm.entrySet().iterator();
        while (hmIterator.hasNext()){
            Map.Entry mapElement =(Map.Entry)hmIterator.next();
            System.out.println(mapElement);
        }
    }
}
