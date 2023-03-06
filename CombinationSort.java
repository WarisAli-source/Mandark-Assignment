import java.util.*;

public class CombinationSort {

    public static List<String> sortStringsL1(List<String> strings) {
        // Sorting the strings based on the first character only
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.charAt(0) - s2.charAt(0);
            }
        });

        return strings;
    }

    public static List<String> sortStringsL2(List<String> strings) {
        // Grouping the strings by their first character
        Map<Character, List<String>> groups = new HashMap<>();
        for (String s : strings) {
            char c = s.charAt(0);
            List<String> group = groups.getOrDefault(c, new ArrayList<>());
            group.add(s);
            groups.put(c, group);
        }

        // Sorting each group in descending order of the remaining characters
        for (List<String> group : groups.values()) {
            group.sort(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    int n1 = Integer.parseInt(s1.substring(1));
                    int n2 = Integer.parseInt(s2.substring(1));
                    return n2 - n1;
                }
            });
        }

        // Merging the sorted groups into a single list
        List<String> sorted = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (groups.containsKey(c)) {
                sorted.addAll(groups.get(c));
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("d34");
        strings.add("g54");
        strings.add("d12");
        strings.add("b87");
        strings.add("g1");
        strings.add("c65");
        strings.add("g40");
        strings.add("g5");
        strings.add("d77");

        List<String> stringsL1 = sortStringsL1(strings);
        System.out.println("L1: " + stringsL1);

        List<String> stringsL2 = sortStringsL2(stringsL1);
        System.out.println("L2: " + stringsL2);
    }


}

