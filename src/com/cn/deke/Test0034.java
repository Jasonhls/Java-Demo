package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            int key = Integer.parseInt(s1[i]);
            if(map.containsKey(key)) {
                int newValue = map.get(key) + 1;
                map.put(key, newValue);
            }else {
                map.put(key, 1);
            }
        }
        Integer max = map.values().stream().max(Comparator.comparingInt(Integer::intValue)).get();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            int key = Integer.parseInt(s1[i]);
            if(map.get(key) == max) {
                list.add(key);
            }
        }
        if(list.size() % 2 == 1) {
            System.out.println(list.get(list.size() / 2));
        }else {
            int a = (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
            System.out.println(a);
        }

    }
}
