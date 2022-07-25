package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test0048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(",");
        int max = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = i; j < s1.length; j++) {
                char[] chars = s1[j].toCharArray();
                int a = 0;
                while(a < chars.length) {
                    //如果没有，就跳出
                    if(s1[i].indexOf(chars[a]) != -1) {
                        break;
                    }
                    a++;
                }
                //如果没有提前跳出，说明没有相同的元素
                if(a == chars.length) {
                    int tmp = s1[i].length() * chars.length;
                    if(max < tmp) {
                        max = tmp;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
