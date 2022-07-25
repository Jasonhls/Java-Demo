package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int max = Integer.parseInt(s);
        int num = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        int remain = 0;
        int time = 0;
        for (int i = 0; i < s1.length; i++) {
            int current = Integer.parseInt(s1[i]);
            int a = current + remain;
            if(a > max) {
                remain = a - max;
            }else {
                remain = 0;
            }
            time++;
        }
        if(remain > 0) {
            if(remain % max == 0) {
                time = time + remain / max;
            }else {
                time = time + remain / max + 1;
            }
        }
        System.out.println(time);

    }






}
