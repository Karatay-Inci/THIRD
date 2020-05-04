package MMAPRIL6Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class D6StringArrayList {
    //Create 2 dimensional String Array List and initialize
    // Write a function to find number of uppercase letters in every row
    public static void main(String[] args) {
        ArrayList<ArrayList<String >> words = new ArrayList<>();
        ArrayList<String>               a   = new ArrayList<>(Arrays.asList("JaVa","is","Fun"));
        words.add(a);
        words.add(a);
        words.get(1).add("AAAAA");
        System.out.println(words);
        findUpperCases(words);
        System.out.println("\t\t----");
        findLowerCases(words);
        System.out.println("\t\t----");
        findUpperCasesInWords(words);

    }
    public static void findUpperCases(ArrayList<ArrayList<String >>arr){
        int counterWord;
        int counterRow;
        for (int i = 0; i < arr.size(); i++) { // to fetch 1 dim String arrays 
            counterRow=0;
            for (int j = 0; j <arr.get(i).size() ; j++) { //to fetch String elements
                counterWord=0;
                for (int k = 0; k <arr.get(i).get(j).length(); k++) { //to fetch chars
                    if (Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        counterWord++;
                    }
                }
                counterRow+=counterWord;
            }
            System.out.println("There are "+counterRow+" upper case at row"+(i+1));
        }
    }
    // Write a function to find number of lower case letters in every row
    public static void findLowerCases(ArrayList<ArrayList<String >>arr){
        int counterWord;
        int counterRow;
        for (int i = 0; i < arr.size(); i++) { 
            counterRow=0;
            for (int j = 0; j <arr.get(i).size() ; j++) { 
                counterWord=0;
                for (int k = 0; k <arr.get(i).get(j).length(); k++) {
                    if (Character.isLowerCase(arr.get(i).get(j).charAt(k))){
                        counterWord++;
                    }
                }
                counterRow+=counterWord;
            }
            System.out.println("There are "+counterRow+" lower case at row"+(i+1));
        }
    }
    // Write a function to find number of uppercase letters in every word
    public static void findUpperCasesInWords(ArrayList<ArrayList<String >> arr){
        int countWord;
        for (int i = 0; i <arr.size() ; i++) {
            for (int j = 0; j <arr.get(i).size() ; j++) {
                countWord=0;
                for (int k = 0; k <arr.get(i).get(j).length() ; k++) {
                    if(Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        countWord++;
                    }
                }
                System.out.println("There are "+countWord+" upper case in "+arr.get(i).get(j));


            }

        }
    }
}
