package collectionFramework.map;

import java.util.Map;
import java.util.TreeMap;

//TreeMap stores the collection of elements in sorted order using key.
public class LearnTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new TreeMap<>();

        numbers.put(40, "Hello");
        numbers.put(20, "Hello");
        numbers.put(30, "Hello");
        numbers.put(10, "Hello");

        System.out.println(numbers);
    }
}
