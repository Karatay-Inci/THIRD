package MMAPRIL25CollectionsReview;

import java.util.HashMap;

public class R16Cities {
    //Create HashMap with elements given below
   //"Los angeles->85   "Chicago->30    "Denver->55     "Orlando->90);
    public static void main(String[] args) {
        HashMap<String ,Integer> cityTemp = new HashMap<>();
        cityTemp.put("Los angeles",85);
        cityTemp.put("Chicago",30);
        cityTemp.put("Denver",55);
        cityTemp.put("Orlando",90);

        int average = 0;
        for (int degree : cityTemp.values()){
            average += degree;
        }
        System.out.println("Average Temp : "+ (average/cityTemp.size()));
    }
}
