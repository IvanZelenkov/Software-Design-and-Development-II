package Chapter16Practice;

import java.util.*;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        // create HashMap to store String keys and Integer values. HashMap implements interface Map
        // and it creates HashMap with a default initial capacity(16 elements) and default load factor(0.75)
        // these defaults are built into the implementation of HashMap
        Map<String, Integer> map = new HashMap<>();

        createMap(map);
        displayMap(map);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String[] tokens  = input.nextLine().split(" ");
        input.close();

        for (String token : tokens) {
            String key = token.toLowerCase();

            if (map.containsKey(key))
                map.put(token, map.get(key) + 1);
            else
                map.put(token, 1);
        }
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); // get keys

        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        // generate output for each key in map
        System.out.println("Number of duplicated words: ");
        for (String key : sortedKeys) {
            if (map.get(key) > 1) // map.get(key) we getting value of the related key, NOT KEY!
                System.out.printf("%s ", map.get(key));
        }
    }

}
