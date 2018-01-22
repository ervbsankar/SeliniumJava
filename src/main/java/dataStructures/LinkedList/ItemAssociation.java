package dataStructures.LinkedList;

import java.util.*;

public class ItemAssociation {

    private  static Map<String, Set<String>> map = new LinkedHashMap<>();

    public static void main(String[] args) {

        String[][] str = {{"item1","item2"},{"item2","item3"},{"item2","item6"},{"item5","item6"}};
        String[] array = itemAssoc(str);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static String[] itemAssoc(String[][] str) {
        for (String[] aStr : str) {
            Set<String> temp = new LinkedHashSet<>();
            for (int j = 0; j < aStr.length; j++) {

                if(j == 0) {
                    if (map.containsKey(aStr[j])) {
                        temp = map.get(aStr[j]);
                    }
                }
                if (j == aStr.length - 1) {
                    map.put(aStr[j], temp);
                }
                temp.add(aStr[j]);
            }
        }

        Set<String> set = new LinkedHashSet<>();
        for(Map.Entry<String, Set<String>> item : map.entrySet()){
            if(set.size() == 0) set.addAll(item.getValue());
            if(set.size() < item.getValue().size()) { set.clear();
            set.addAll(item.getValue());
            }
            System.out.println(item.getKey() +  "  " + item.getValue().toString());
        }

        return set.toArray(new String[set.size()]);
    }


}
