package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        if(s1.length == 1) {
            System.out.println(s1[0].split("/")[0]);
            return;
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> oneList = new ArrayList<>();
            oneList.add(Integer.parseInt(s1[0].split("/")[0]));
        for (int i = 1; i < s1.length; i++) {
            String[] split = s1[i].split("/");
            if(split[1].equals("Y")) {
                oneList.add(Integer.parseInt(split[0]));
            }else {
                list.add(oneList);
                oneList = new ArrayList<>();
                oneList.add(Integer.parseInt(split[0]));
            }
        }
        if(oneList.size() > 0) {
            list.add(oneList);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sort(Comparator.comparingInt(Integer::intValue));
        }
        list.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                Integer a = o1.get(0);
                Integer b = o2.get(0);
                if(a > b) {
                    return 1;
                }else if(a < b) {
                    return -1;
                }
                return 0;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < list.get(i).size(); j++) {
                sb.append(list.get(i).get(j)).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
