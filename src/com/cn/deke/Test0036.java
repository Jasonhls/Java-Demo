package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String[] s1 = br.readLine().split(" ");
        Integer value = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(s1[i]);
            if(a < value) {
                list.add(a);
            }
        }
        list.sort(Comparator.comparingInt(Integer::intValue));
        int count = num - list.size();
        int i = 0, j = list.size() - 1;
        while(i < j) {
            //每个团队只能有两个人参加，因此只需要拿出两个元素即可
            if(list.get(i) + list.get(j) >= value) {
                i++;
                j--;
                count++;
            }else {
                i++;
            }
        }
        System.out.println(count);
    }
}
