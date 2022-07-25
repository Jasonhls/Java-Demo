package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test0051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        int max = 0;
        int num = 0;
        char current = 'a';
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c >= '0' && c <= '9') {
                //如果大于当前值，加一，继续
                if(c >= current) {
                    num++;
                }else {
                    //如果小于，就断开，重置当期值
                    current = c;
                    //如果大于max，获取num值
                    if(max < num) {
                        max = num;
                    }
                    //最后重置num
                    num = 1;
                }
            }else {
                //就断开，重置current
                current = 'a';
                if(max < num) {
                    max = num;
                }
                //重置num
                num = 0;
            }
        }
        System.out.println(max);
    }
}
