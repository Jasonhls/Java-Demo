package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        List<TreeMap<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String[] s1 = br.readLine().split(" ");
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int j = 0; j < s1.length; j++) {
                treeMap.put(Integer.parseInt(s1[j]), j);
            }
            list.add(treeMap);
        }

        int min = -1;
        for (int k = 0; k < 3; k++) {
            Integer key = new ArrayList<>(list.get(0).keySet()).get(k);
            int sum = key;
            int type = list.get(0).get(key);
            for (int i = 1; i < list.size(); i++) {
                //list.get(i).keySet()得到是一个按升序排序的set
                ArrayList<Integer> keyList = new ArrayList<>(list.get(i).keySet());
                //先取第一个
                Integer firstKey = keyList.get(0);
                Integer firstType = list.get(i).get(firstKey);
                if(!firstType.equals(type)) {
                    type = firstType;
                    sum = sum + firstKey;
                }else {
                    //取第二个，因为key值是排序好的
                    sum = sum + keyList.get(1);
                    type = list.get(i).get(keyList.get(1));
                }
            }
            if(min == -1) {
                min = sum;
            }
            if(min > sum) {
                min = sum;
            }

        }

        System.out.println(min);
    }




}
