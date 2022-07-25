package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Test0055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        int value = Integer.parseInt(br.readLine());
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        char current = chars[0];
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c == current) {
                num++;
                if(i == chars.length - 1) {
                    int max = num;
                    if(treeMap.containsKey(current)) {
                        max = treeMap.get(current) > num ? treeMap.get(current) : num;
                    }
                    treeMap.put(current, max);
                    break;
                }
            }else {
                int max = num;
                if(treeMap.containsKey(current)) {
                    max = treeMap.get(current) > num ? treeMap.get(current) : num;
                }
                treeMap.put(current, max);
                current = c;
                num = 1;

            }
        }
        //排好了序，由小到大
        List<Integer> list = new ArrayList<>(treeMap.values()).stream().sorted(Integer::compareTo).collect(Collectors.toList());
        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.size() - i == value) {
                System.out.println(list.get(i));
            }
        }
    }
}
