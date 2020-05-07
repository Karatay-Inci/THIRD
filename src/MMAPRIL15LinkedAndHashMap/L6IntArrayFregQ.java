package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L6IntArrayFregQ {
    //Write a java program to count number of occurences of every element for given array
    public static void main(String[] args) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        myMap.put(1,4);
        System.out.println(myMap);
        myMap.put(1,5);
        System.out.println(myMap);

        int [] arr={1,1,5,7,3,4,6,8,9,9,7,4,2,2};
        findFrequencies(arr);
    }
    public static void findFrequencies(int []arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
            if (!freq.containsKey(num)){
                freq.put(num,1);
            }
            else{
                freq.put(num,freq.get(num)+1);
            }
            System.out.println(freq);
        }
        for (int key:freq.keySet()) {
            System.out.println("Number "+key+" = "+freq.get(key)+" times seen in the array");
        }
    }
}
