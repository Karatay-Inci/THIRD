package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class L26HackerRankPhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many entries?");
        int n = scan.nextInt();
        HashMap<String , Integer> pb = new HashMap<>();
        String name;
        int phoneNumber;
        for (int i = 0; i < n; i++) {
            System.out.print("Name?");
            name = scan.next();
            System.out.print("Phone Number?");
            phoneNumber = scan.nextInt();
            pb.put(name, phoneNumber);
        }
        // query starts
        int numberOfQuestion=3;
        String query;
        while (numberOfQuestion>=0){
            System.out.println("Enter name for the entry :");
            query=scan.next();
            if (pb.containsKey(query)){
                System.out.println(query+"="+ pb.get(query));
            }
            else {
                System.out.println("Not found");
            }
            numberOfQuestion--;
        }
    }
}
