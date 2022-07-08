package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author: helisen
 * @Date 2022/5/10 15:29
 * @Description:
 */
public class Test20 {
    //1 0 1 0 0 2 1
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList();
        while(true) {
            String str = br.readLine();
            if(str == null) {
                break;
            }
            str = str.trim();
            if(str.equals("")) {
                break;
            }
            list.add(str);
        }
        LinkedHashMap<String, Integer> map = new LinkedHashMap();
        for(int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArr = str.split(" ");
            String name = strArr[0].substring(strArr[0].lastIndexOf("\\") + 1);
            String num = strArr[1];
            if(name.length() > 16) {
                name = name.substring(name.length() - 16);
            }
            String key = name + " " + num;
            if(map.containsKey(key)) {
                Integer value = map.get(key) + 1;
                map.put(key, value);
            }else {
                map.put(key, 1);
            }
        }
        List<String> list2 = new ArrayList();
        for(Map.Entry entry : map.entrySet()) {
            list2.add((String)entry.getKey());
        }
        StringBuilder sb = new StringBuilder();
        if(list2.size() >= 8) {
            for(int i = list2.size() - 8; i < list2.size(); i++) {
                sb.append(list2.get(i)).append(" ").append(map.get(list2.get(i))).append("\r\n");
            }
        }else {
            for(int i = 0; i < list2.size(); i++) {
                sb.append(list2.get(i)).append(" ").append(map.get(list2.get(i))).append("\r\n");
            }
        }

        System.out.print(sb);
    }

}
