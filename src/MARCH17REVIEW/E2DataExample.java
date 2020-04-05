package MARCH17REVIEW;

import java.util.Arrays;

public class E2DataExample {
    public static void main(String[] args) {
        String date ="12/24/2020";
        String result []=checkDate(date);
        System.out.println(Arrays.toString(result));
    }
    public static String[] checkDate(String date){
        String[] arr = new String[3];
        String concat ="";
        int index =0;
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i)!='/'){
                concat+=date.charAt(i);
            }
            else{
                arr[index]=concat;
                concat="";
                index++;
            }
        }
        arr[2]=concat;
        return arr;
    }
}
