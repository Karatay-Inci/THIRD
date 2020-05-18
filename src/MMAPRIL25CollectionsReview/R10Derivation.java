package MMAPRIL25CollectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R10Derivation {
    public static void main(String[] args) {
        int arr[] ={2,3,44,33,5,77};
       int result []=applyFisrtDerivation(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] applyFisrtDerivation(int arr[]){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            result.add(arr[i]-arr[i+1]);
        }
        int resultArr[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i]=result.get(i);
        }
        return resultArr;
    }
}
