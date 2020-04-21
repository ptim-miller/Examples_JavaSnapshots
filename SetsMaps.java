// All rights reserved (c) 2020 P. Tim Miller
// For academic use only

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Add languages to Set
public class SetsMaps {
    public static void main(String[] args) {
        //SET EXAMPLE
        Set<String> hs = new HashSet<String>();
        hs.add("English");
        hs.add("Spanish");
        hs.add("Arabic");
        hs.add("German");
        hs.add("English");

        System.out.println(hs.size());
        System.out.println(hs.contains("English"));
        System.out.println(hs);

        Iterator<String> hsIterator = hs.iterator();
        while(hsIterator.hasNext()){
            System.out.println(hsIterator.next());
        }

        for(String o : hs){
            System.out.println(o);
        }

        Set<String> ts = new TreeSet<String>(hs);
        System.out.println(ts);

        Iterator<String> tsIterator = ts.iterator();
        while(tsIterator.hasNext()){
            System.out.println(tsIterator.next());
        }

        for(String o : ts){
            System.out.println(o);
        }

        // MAP EXAMPLE
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Baseball");
        myMap.put(10, "Football");
        myMap.put(20, "Golf");
        myMap.put(35, "Swimming");

        System.out.println(myMap.get(35));
        System.out.println(myMap.containsKey(20));
        System.out.println(myMap.containsValue("Football"));
        System.out.println(myMap.containsValue("Frisby"));

        for(Map.Entry<Integer, String> item : myMap.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }

        Map<Integer, String> tm = new TreeMap<Integer, String>(myMap);
        for(Map.Entry<Integer, String> item : tm.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}

