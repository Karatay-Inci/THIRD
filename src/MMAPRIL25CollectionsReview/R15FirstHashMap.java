package MMAPRIL25CollectionsReview;

import java.util.HashMap;
import java.util.Iterator;

public class R15FirstHashMap {
    //Create String key , String value hashmap using data below
    //      *Java->medium     *Sql->entry     *Selenium->master      *Cucumber->expert
    public static void main(String[] args) {
        HashMap<String ,String > hm = new HashMap<>();
        hm.put("Java","Medium");
        hm.put("SQL","Expert");
        hm.put("Selenium","Master");
        hm.put("Cucumber","Novice");
        System.out.println(hm);
        Iterator<String > iterator = hm.keySet().iterator();
        String key;
        while (iterator.hasNext()){
            key = iterator.next();
            System.out.println(key+":\t"+hm.get(key));
        }
    }
}
