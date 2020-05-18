package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R9ArrayListMultip {
    //Multiply 2 arrays
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1,2,3));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(4,5,6));
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i)*arr2.get(i));

        }

    }

}

