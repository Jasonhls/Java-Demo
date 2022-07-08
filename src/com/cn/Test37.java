package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: helisen
 * @Date 2022/5/30 13:36
 * @Description:
 */
public class Test37 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        Map<String, Integer> map = get(num);
        System.out.println(map.get("old") + map.get("new"));

    }

    public static Map<String, Integer> get(int num) {
        if(num == 1 || num == 2) {
            Map<String, Integer> map = new HashMap<>(2);
            map.put("old", 1);
            map.put("new", 0);
            return map;
        }
        if(num == 3) {
            Map<String, Integer> map = new HashMap<>(2);
            map.put("old", 1);
            map.put("new", 1);
            return map;
        }
        Map<String, Integer> map = get(num - 1);
        Integer oldNum = map.get("old");
        Integer newNum = map.get("new");
        map.put("old", newNum);
        map.put("new", oldNum + newNum);
        return map;
    }

}