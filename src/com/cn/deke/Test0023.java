package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test0023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = Integer.parseInt(s);
        int num = Integer.parseInt(br.readLine());
        List<String[]> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;
        for (int i = 0; i < num; i++) {
            String[] split = br.readLine().split(",");
            map.put(i, 0);
            list.add(split);
            total = total + split.length;
        }
        StringBuilder sb = new StringBuilder();
        int totalLen = 0;
        while(true) {
            for (int i = 0; i < list.size(); i++) {
                String[] arr = list.get(i);
                Integer current = map.get(i);
                if(arr.length - current == 0) {
                    continue;
                }
                if(arr.length - current >= len) {
                    for (int j = current; j < len + current; j++) {
                        sb.append(arr[j]).append(",");
                    }
                    int newValue = current + len;
                    map.put(i, newValue);
                    totalLen = totalLen + len;
                }else {
                    for (int j = map.get(i); j < arr.length; j++) {
                        sb.append(arr[j]).append(",");
                    }
                    totalLen = totalLen + arr.length - map.get(i);
                    map.put(i, arr.length);
                }
            }
            if(totalLen == total) {
                break;
            }
        }
        String str = sb.toString();

        System.out.println(str.substring(0, str.length() - 1));

    }




}
