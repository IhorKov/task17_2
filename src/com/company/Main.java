package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String[] arr1 = new String[] {"salt", "tea", "soda", "toast"};
	    String[] arr2 = new String[] {"aa", "bb", "cc", "aAA", "cCC", "d"};

	    Map<String, String> map1 = firstChar(arr1);
	    Map<String, String> map2 = firstChar(arr2);

	    for(Map.Entry<String, String> item: map1.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        for(Map.Entry<String, String> item: map2.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }

    public static Map<String, String> firstChar(String[] arrStr) {
        Map<String, String> map = new HashMap<>();
        String key;
        String value;

        for (int i = 0; i < arrStr.length; i++) {
            key = Character.toString(arrStr[i].charAt(0));
            if(map.containsKey(key)) {
                value = map.get(key) + arrStr[i];
                map.put(key, value);
            }
            else {
                map.put(key, arrStr[i]);
            }
        }

        return map;
    }
}
