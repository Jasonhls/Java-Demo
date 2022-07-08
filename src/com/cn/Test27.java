package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: helisen
 * @Date 2022/5/10 15:29
 * @Description:
 */
public class Test27 {
    //1 0 1 0 0 2 1
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String s1 = br.readLine();
        String[] arr = s1.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        int dui = num / 2;
        Set<String> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i == j) {
                    continue;
                }
                int min = list.get(i) > list.get(j) ? list.get(j) : list.get(i);
                int max = list.get(i) > list.get(j) ? list.get(i) : list.get(j);
                StringBuilder sb = new StringBuilder();
                sb.append(min).append("_").append(max);
                String ss = sb.toString();
                if(set.contains(ss)) {
                    continue;
                }
                set.add(ss);
                set2.add(min);
                set2.add(max);
                map.put(min, max);
            }
        }
        int m = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer total = entry.getKey() + entry.getValue();
            if(!isA(total)) {
                m++;
            }
        }
        System.out.println(m);

    }


    public static boolean isA(int a) {
        int i = 2;
        boolean res = false;
        while(i <= Math.sqrt(a)) {
            if(a % i == 0) {
                res = true;
                break;
            }
            i++;
        }
        return res;
    }

}
