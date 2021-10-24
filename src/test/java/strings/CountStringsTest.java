package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.*;

public class CountStringsTest {

    CountStrings countStrings;

    @BeforeEach
    public void setUp() {
        countStrings = new CountStrings();
    }

    @Test
    public void shouldFillTheList() {
        String input1 = "jjj";
        System.setIn(new ByteArrayInputStream(input1.getBytes()));

        List<String> list = new ArrayList<>();
        list.add(input1);

        List<String> list2 = new ArrayList<>();

        Assertions.assertEquals(list, countStrings.getStrings(list2));
    }

    @Test
    public void shouldCountStrings() {
        List<String> list = new ArrayList<>();
        list.add("ll");
        list.add("ll");
        list.add("ff");
        list.add("y7");
        list.add("y7");
        list.add("y7");

        Map<String, Integer> map = new HashMap<>();
        map.put("ll", 2);
        map.put("ff", 1);
        map.put("y7", 3);

        Assertions.assertEquals(map, countStrings.getNumberLines(list));
    }

    @Test
    public void shouldGetTwoStrings() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("ll", 2);
        hashMap.put("ff", 1);
        hashMap.put("y7", 3);

        String twoStrings = "y7, ll";

        Assertions.assertEquals(twoStrings, countStrings.getTwoStrings(hashMap));
    }
}
