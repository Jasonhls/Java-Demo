package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        String[] arr = br.readLine().split(" ");
        Integer h = Integer.parseInt(s1[0]);
        int num = Integer.parseInt(s1[1]);
        List<Integer> list = new ArrayList<>(num);
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1 - h) > Math.abs(o2 - h)) {
                    return 1;
                }else if(Math.abs(o1 - h) < Math.abs(o2 - h)) {
                    return -1;
                }
                if(o1 > o2) {
                    return 1;
                }else if(o1 < o2) {
                    return -1;
                }
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb);

    }






}
