package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class L16HashMapHashTable {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        Hashtable<String ,String > ht = new Hashtable<>();
        hm.put(null,"one");
        hm.put("two",null);
        hm.put(null,"one");
        //ht.put(null,"one");   Hashtable does not allow null key or value
        System.out.println(hm);
        System.out.println(ht);
    }
}
