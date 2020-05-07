package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L7CharFrequencyQ {
    //Write Java method to count the occurrence of each character in a string
    public static void main(String[] args) {
        String test= "abcabcabcg";
        findFrequencyOfChars(test);

    }
    public static void findFrequencyOfChars(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        char key;
        int value;
        for (int i = 0; i <str.length() ; i++) {
            key=str.charAt(i);
            if(map.containsKey(key)){
                value=map.get(key);
                map.put(key,value+1);   //increase 1 value of that key
            }
            else{
                map.put(key,1);
            }
        }
        System.out.println(map);
    }
}
