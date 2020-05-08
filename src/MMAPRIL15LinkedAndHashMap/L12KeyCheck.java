package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L12KeyCheck {
    //Write a java method to check given key is exist or not
    public static void main(String[] args) {
        HashMap<String ,String > hm = new HashMap<>();
        hm.put("a","A");
        hm.put("b","B");
        hm.put("c","C");
        System.out.println(isHasKey(hm,"a"));
        System.out.println(isHasKey(hm,"A"));

        System.out.println(isHasValue(hm,"B"));
        System.out.println(isHasValue(hm,"b"));



    }
    public static boolean isHasKey (HashMap<String ,String >hMap,String keyToCheck){
        boolean result = false;
        for (String key: hMap.keySet()){
            if (key.equals(keyToCheck)){
                result= true;
                break;
            }
        }
        return result;
    }
    public static boolean isHasValue (HashMap<String ,String >hMap,String valueToCheck){
        boolean result = false;
        for (String value: hMap.values()){
            if (value.equals(valueToCheck)){
                result= true;
                break;
            }
        }
        return result;
    }
}
