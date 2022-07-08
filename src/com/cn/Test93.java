package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: helisen
 * @Date 2022/6/16 13:43
 * @Description:
 */
public class Test93 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String s1 = br.readLine();
        String[] s2 = s1.split(" ");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> listRest = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(s2[i]);
            if(a % 5 == 0) {
                list1.add(a);
            }else {
                if(a % 3 == 0) {
                    list2.add(a);
                }else {
                    listRest.add(a);
                }
            }
        }

        long count5 = list1.stream().count();
        long count3 = list2.stream().count();
        long a = count5 > count3 ? count5 - count3 : count3 - count5;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < listRest.size(); i++) {
            if(i == 0) {
                res = a(new ArrayList<>(), listRest.get(i));
                continue;
            }
            res = a(res, listRest.get(i));
        }
        for (int i = 0; i < res.size(); i++) {
//            if() {
//
//            }
        }

    }

    public static List<Integer> a(List<Integer> list, int b) {
        if(list == null || list.size() == 0) {
            list.add(b);
            list.add(-b);
            return list;
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int aa = list.get(i) + b;
            int bb = list.get(i) - b;
            newList.add(aa);
            newList.add(bb);
        }
        return newList;
    }
}
