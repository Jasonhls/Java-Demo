package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String[] split = br.readLine().split(",");
        String[] split1 = br.readLine().split(",");
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            String key = split[i];
            int score = Integer.parseInt(split1[i]);
            if(map.containsKey(key)) {
                map.get(key).add(score);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(score);
                map.put(key, list);
            }
        }
        StringBuilder sb = new StringBuilder();
        map.entrySet().stream()
                .filter(a -> a.getValue().size() >= 3)
                .sorted(new Comparator<Map.Entry<String, List<Integer>>>() {
            @Override
            public int compare(Map.Entry<String, List<Integer>> entry1, Map.Entry<String, List<Integer>> entry2) {
                entry1.getValue().sort(Integer::compareTo);
                entry2.getValue().sort(Integer::compareTo);
                int a = 0;
                for (int i = entry1.getValue().size() - 1; i >= entry1.getValue().size() - 3;i--) {
                    a += entry1.getValue().get(i);
                }
                int b = 0;
                for (int i = entry2.getValue().size() - 1; i >= entry2.getValue().size() - 3;i--) {
                    b += entry2.getValue().get(i);
                }
                if(a > b) {
                    return -1;
                }else if(a < b) {
                    return 1;
                }else {
                    return Integer.parseInt(entry2.getKey()) - Integer.parseInt(entry1.getKey());
                }
            }
        }).forEach(a -> sb.append(a.getKey()).append(","));
        System.out.println(sb.toString().substring(0, sb.length() - 1));
    }
}
