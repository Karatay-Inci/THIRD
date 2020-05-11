package MMAPRIL15LinkedAndHashMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class L19TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> grades = new TreeMap<>();
        grades.put("Ali",100);
        grades.put("John",100);
        grades.put("Suzi",100);
        Iterator<String > iter = grades.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            System.out.println(key+" = \t"+grades.get(key));
        }

        //create wiyh reverse order
         TreeMap<String , Integer> reverseTree = new TreeMap<>(Collections.reverseOrder());
        reverseTree.put("A",1);
        reverseTree.put("B",2);
        reverseTree.put("C",3);
        reverseTree.put("D",4);
        iter =reverseTree.keySet().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
