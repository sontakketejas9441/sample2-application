package com.sampleexample.sample.SHORTCUTS;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        //Map Examples
        Map<String,Integer> sampleMap = new HashMap<>();

        sampleMap.put("One",1);
        sampleMap.put("Two",2);

        System.out.println("Size of Hashmap: " +sampleMap.size());

        /*
        Checking if the key is present in HashMap and
        Then to fetch the associated value
        */

        if (sampleMap.containsKey("One")){
            Integer value = sampleMap.get("One");
            System.out.println("value = " + value);

        }

        System.out.println("=========");

        /*
        Traversing the hashmap using the for-each loop
        */
        for (Map.Entry<String,Integer> e:
             sampleMap.entrySet()) {
            System.out.println("Key = " + e.getKey());
            System.out.println("Value = " + e.getValue());
        }

        System.out.println("=========");
        System.out.println("Added for Demo 1");
    }
}
