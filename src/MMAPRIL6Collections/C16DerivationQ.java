package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class C16DerivationQ {
    public static void main(String[] args) {
        int[] pixels = {23,53,31,32,55};
        System.out.println(findFirstDerivation(pixels));
        ArrayList<Integer> pixels2 = new ArrayList<>(Arrays.asList(1,45,23,8,2,4,72,10));
        System.out.println(findFirstDerivation(pixels2));
    }
    public static ArrayList<Integer> findFirstDerivation(int [] arr) throws ArrayIndexOutOfBoundsException{
        ArrayList<Integer> derivation = new ArrayList<>();
        try {
            for (int i = 0; i <arr.length ; i++) {
                derivation.add(arr[i]-arr[i+1]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){

        }
        finally {
            return derivation;
        }
    }
    public static ArrayList<Integer> findFirstDerivation(ArrayList<Integer> arr) throws ArrayIndexOutOfBoundsException{
        ArrayList<Integer> x = new ArrayList<>();
        try{
            for (int i = 0; i <arr.size()-1 ; i++) {
                x.add(arr.get(i)-arr.get(i+1)); //Why do we add +1
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            return x;
        }
    }
}
