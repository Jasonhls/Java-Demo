package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Test0073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int value = 1;
            if(map.containsKey(c)) {
                value = value + map.get(c);
            }
            map.put(c, value);
        }
        // a -> z
        List<Map.Entry<Character, Integer>> list1 = map.entrySet().stream().filter(a -> a.getKey() >= 'a').collect(Collectors.toList());
        print(list1);
        // A -> Z
        List<Map.Entry<Character, Integer>> list2 = map.entrySet().stream().filter(a -> a.getKey() <= 'Z').collect(Collectors.toList());
        print(list2);

    }

    public static void print(List<Map.Entry<Character, Integer>> list) {
        StringBuilder sb = new StringBuilder();
        list.stream().sorted(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o1.getValue() != o2.getValue()) {
                    //值是从大到小，降序
                    return o2.getValue() - o1.getValue();
                }else {
                    return o1.getKey() - o2.getKey();
                }
            }
        });
        for (Map.Entry entry : list) {
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(";");
        }
        System.out.print(sb);
    }
}
