package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L9MaxPair {
    //Write a java program to find max multiplication of adjacent values of the integer array.
    //Return index and values
    public static void main(String[] args) {
        int arr[]={1,2,3,5,2,4};        //1*2  2*3  3*5  5*2  2*4   --->Index 2->3*5   (max)
        findAdjacentMax(arr);           // 2    6    15  10    8    --->Index 2->15
    }
    public static void findAdjacentMax(int []arr){
        HashMap<Integer, Integer> hm =  new HashMap<>();
        for (int i = 0; i <arr.length-1 ; i++) {
            hm.put(i,arr[i]*arr[i+1]);     //index num[i] and next num[i+1]
        }
       // System.out.println(hm);
        int max=0;  //to find max
        int index=0;    //to store max values key (index)
        for (int key : hm.keySet()){
            if (hm.get(key)>max){
                max=hm.get(key);
                index=key;
            }
        }
        System.out.println(index+"\t=\t"+max);
    }
}
