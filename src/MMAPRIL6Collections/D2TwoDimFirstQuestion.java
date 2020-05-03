package MMAPRIL6Collections;

import java.util.ArrayList;

public class D2TwoDimFirstQuestion {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myTwo = new ArrayList<>();
        int number=1;
        for (int i = 0; i < 2; i++) {
            myTwo.add(new ArrayList<>());
            for (int j = 0; j <5 ; j++) {
                myTwo.get(i).add(number);
                number++;
            }
        }
       // System.out.println(myTwo);
        for (int i = 0; i <myTwo.size() ; i++) {
            System.out.println(myTwo.get(i));
        }
        for (ArrayList<Integer> arr : myTwo){
            for (int numbers : arr) {
                System.out.println(numbers);
            }
        }
        //While loop implementation
    }

}
