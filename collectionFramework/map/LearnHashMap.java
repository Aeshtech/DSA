package collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map is different from collection framework as it is used to store key-value pairs unlike other interfaces in collection framework. Map can only contain unique key always (values may be duplicate) and if we try to add same
 * key again then it will override the key's value if already existing in map.
 */

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println(numbers);

        numbers.put("Two", 20); // this will override the value of key 'Two'

        System.out.println(numbers);

        // Let's say, if we wanted to put element(i.e key-value pair) in map only when
        // there is no key exist priorly. we can do this in two ways.

        // we are checking if there is no key exist in map already then only put
        if (!numbers.containsKey("Two")) {
            numbers.put("Two", 50);
        }

        // using inbuilt method
        numbers.putIfAbsent("Two", 24);

        System.out.println(numbers);

        // lets iterate over map using foreach loop and leverages the Entry interface
        // and entrySet() method.
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println("----------------------");
        // foreach loop over the keys in numbers
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        // foreach loop over the values in map
        for (Integer value : numbers.values()) {
            System.out.println(value);
        }

    }
}
