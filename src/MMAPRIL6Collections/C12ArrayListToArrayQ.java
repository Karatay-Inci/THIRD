package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class C12ArrayListToArrayQ {
    public static void main(String[] args) {
        ArrayList<String > arrayList = new ArrayList<>(Arrays.asList("Java","is","my","Passion"));
        String [] arr = convertToStringArray(arrayList);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static String [] convertToStringArray(ArrayList<String >arr){
        String [] arrStr = new String[arr.size()];
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i]=arr.get(i);
        }
        return arrStr;
    }
}
