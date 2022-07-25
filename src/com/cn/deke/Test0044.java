package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test0044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(",");
        int value = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(split.length);
        for (int i = 0; i < split.length; i++) {
            list.add(Integer.parseInt(split[i]));
        }

        int res = 0;
        //每个累加试试
        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            int num = 0;
            for (int j = i; j < list.size(); j++) {
                sum += list.get(j);
                num++;
                //如果相等，就停止
                if (sum == value) {
                    //如果子串长于之前的，替换
                    if(res < num) {
                        res = num;
                    }
                    break;
                }
                //如果大于，也停止
                if (sum > value) {
                    break;
                }
            }
        }

        System.out.println(res > 0 ? res : -1);
    }
}
