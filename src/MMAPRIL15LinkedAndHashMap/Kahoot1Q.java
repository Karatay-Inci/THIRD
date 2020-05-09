package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class Kahoot1Q {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        String a = "aaaabbbb";
        for (int i = 0; i <a.length(); i++) {
            mp.put((int)a.charAt(i),i);
        }
        System.out.println(mp);
    }
}
