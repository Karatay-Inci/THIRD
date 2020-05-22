package MMAPRIL25CollectionsReview;

import java.util.HashMap;

public class R23Votes {
    public static void main(String[] args) {

        //Find winner of an election where votes are represented as candidate names
        String votes [] = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie",
                       "jamie", "john", "johnny", "jamie", "johnny", "john","john"};
        HashMap<String ,Integer> voteCounts = new HashMap<>();
        for (String candidate : votes) {
             if (voteCounts.containsKey(candidate)) {
                 voteCounts.put(candidate, voteCounts.get(candidate) + 1);
             }
             else{
                 voteCounts.put(candidate,1);
             }
        }
        System.out.println(voteCounts);
    }
}
