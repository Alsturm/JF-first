package ru.training.jf.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

public class LinkedHashMapExample {
    @Test
    void name() {
        Map<String, Integer> linkedHashMap
                = new LinkedHashMap<>(16, 0.75f, false);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        System.out.println(linkedHashMap);

        System.out.printf("%nThe age for Lewis is %d%n", linkedHashMap.get("Lewis").intValue());

        System.out.println(linkedHashMap);
    }

    @Test
    void binarySearch() {
        List<Integer> list3 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
        System.out.printf("(1) Index: %d%n", Collections.binarySearch(list3, 7));
        System.out.printf("(2) Index: %d%n", Collections.binarySearch(list3, 9));

        List<String> list4 = Arrays.asList("blue", "green", "red");
        System.out.printf("(3) Index: %d%n", Collections.binarySearch(list4, "red"));
        System.out.printf("(4) Index: %d%n", Collections.binarySearch(list4, "cyan"));

    }
}
