package com.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: helisen
 * @Date 2022/6/2 15:09
 * @Description:
 */
public class Test105 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while(true) {
            String s = br.readLine();
            if(s == null || s.equals("")) {
                break;
            }
            list.add(Integer.parseInt(s));
        }
        int m = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer k = list.get(i);
            if(k < 0) {
                m++;
            }else {
                sum = sum + k;
            }
        }
        System.out.println(m);
        double b = list.size() - m;
        double d = sum / b;
        String str = String.format("%.1f", d);
        System.out.println(str);
    }
}
