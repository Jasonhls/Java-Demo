package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test0063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split("@");
        String[] split1 = split[0].split(",");
        Map<String, Integer> map = new HashMap<>();
        for (String str : split1) {
            String[] split2 = str.split(":");
            int a = Integer.parseInt(split2[1]);
            if(map.containsKey(split2[0])) {
                a = a + map.get(split2[0]);
            }
            map.put(split2[0], a);
        }
        String[] usedList = split[1].split(",");
        for (String str : usedList) {
            String[] split2 = str.split(":");
            String key = split2[0];
            Integer value = Integer.parseInt(split2[1]);
            if(map.containsKey(key)) {
                int newValue = map.get(key) - value;
                map.put(key, newValue);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 0) {
                sb.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
            }
        }
        System.out.println(sb.toString().substring(0, sb.length() - 1));
    }
}
