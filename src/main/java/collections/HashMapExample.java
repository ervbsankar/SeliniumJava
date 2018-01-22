package collections;

import java.util.*;

public class HashMapExample extends HashMap{

    public static void main(String[] args){
        HashMapExample example = new HashMapExample();
        example.put("a",1);
        example.put("d",2);
        example.put("c",5);
        example.put("b",45);
        example.put("e",23);


        HashMap map = new HashMap();
        map.put("a",1);
        map.put("c",34);
        map.put("b",33);


      /*  Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Entry) iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/

       /* map.forEach((k,v) -> System.out.println(k + " : " + v));*/

        Map<String, Integer> treemap = new TreeMap<String, Integer>(example);
        //treemap.forEach((k,v) -> System.out.println(k + " : " + v));

        HashMapExample example2 = new HashMapExample();
        example2.put(23,1);
        example2.put(21,2);
        example2.put(25,5);
        example2.put(22,45);
        example2.put(24,23);

       /* List<Map.Entry<String,Integer>> list = new dataStructures.LinkedList<Map.Entry<String,Integer>>(example2.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
*/

        System.out.println(example2.entrySet());
        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(example2.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Iterator<Map.Entry<Integer, Integer>> it = list.iterator(); it.hasNext();) {
            Map.Entry<Integer, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        sortedMap.forEach((k,v)-> System.out.println(k + "==" + v));

        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o2).compareTo(o1);
            }
        });

        treeMap.putAll(example2);

        treeMap.forEach((k,v)-> System.out.println(k + "==" + v));
    }
}
