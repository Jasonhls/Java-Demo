package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author: helisen
 * @Date 2022/6/14 15:40
 * @Description:
 */
public class Test102 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
            if(!list.contains(c)) {
                list.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        list.sort(new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                if(map.get(c1) > map.get(c2)) {
                    return 1;
                }else if(map.get(c1) < map.get(c2)) {
                    return -1;
                }else {
                    int i1 = c1;
                    int i2 = c2;
                    if(i1 < i2) {
                        return 1;
                    }else if(i1 > i2) {
                        return -1;
                    }else {
                        return 0;
                    }
                }
            }
        });
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}
