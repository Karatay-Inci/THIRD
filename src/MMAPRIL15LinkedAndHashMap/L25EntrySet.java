package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L25EntrySet {
    public static void main(String[] args) {
        HashMap<String ,String > hm = new HashMap<>();
        hm.put("A","B");
        hm.put("C","D");
        System.out.println(hm);
        System.out.println(hm.entrySet());
    }
}
