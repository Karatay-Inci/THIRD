package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L5Cities {
    public static void main(String[] args) {
        HashMap<String ,Integer> cities = new HashMap<>();
        cities.put("Los angeles",85);
        cities.put("Chicago",30);
        cities.put("Denver",55);
        cities.put("Orlando",90);
        System.out.println(cities);
        double average;
        int total=0;
        for (int temp : cities.values()) {
            total+=temp;
        }
        average=total/cities.size();
        System.out.format("Average Temperature :%.2f", average);
    }
}
