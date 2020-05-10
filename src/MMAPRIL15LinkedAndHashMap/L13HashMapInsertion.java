package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L13HashMapInsertion {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>(100);
        for (int i = 0; i < 10; i++) {
            hm.put(i,i+i);
        }
        for (int x : hm.keySet()){
            System.out.println(x+"="+hm.get(x));
        }


    }
}
