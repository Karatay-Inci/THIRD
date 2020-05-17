package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R8ArraylisToArrayConvert {
    //Convert String Arraylist to String Array
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>(List.of("Java","Is","Fun"));
        String arr[] = new String[list.size()];
        arr = list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}
