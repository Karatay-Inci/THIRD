package MMAPRIL15LinkedAndHashMap;

import java.util.HashMap;

public class L4L3SecondHashMap {
    public static void main(String[] args) {
        HashMap<String ,String > skills = new HashMap<String ,String >(4);
        skills.put("java\t","junior");
        skills.put("Sql\t\t","medium");
        skills.put("selenium   ","expert");
        skills.put("cucumber   ","master");
        System.out.println(skills);

        for (String key : skills.keySet()) {
            System.out.println(key+"\t\t="+skills.get(key));

        }
    }
}
