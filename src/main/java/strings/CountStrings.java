package strings;

import java.util.*;

public class CountStrings {

    HashMap<String, Integer> map = new HashMap<>();
    List<String> newList = new ArrayList<>();
    static CountStrings countStrings = new CountStrings();

    public static void main(String[] args) {
        System.out.println("Entered lines:\n" +
                countStrings.getStrings(countStrings.newList));
        System.out.println("Number of lines entered:\n" +
                countStrings.getNumberLines(countStrings.newList));
        System.out.println("Two lines that are entered more often than others:\n" +
                countStrings.getTwoStrings(countStrings.map));
    }

    public List<String> getStrings(List<String> newList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something and then enter \"stop\":");
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            if (a.equals("stop")) {
                break;
            }
            newList.add(a);
        }
        return newList;
    }

    public Map<String, Integer> getNumberLines(List<String> newList) {
        for (String b : newList) {
            map.put(b, Collections.frequency(newList, b));
        }
        return map;
    }

    public String getTwoStrings(HashMap<String, Integer> map) {
        MapComparator comparator = new MapComparator();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(comparator);
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>(list.size());
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        String[] array = new String[sortedMap.size()];
        sortedMap.keySet().toArray(array);
        return (array[array.length - 1] + ", " + array[array.length - 2]);
    }
}
