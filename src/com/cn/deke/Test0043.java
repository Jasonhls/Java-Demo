package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test0043 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //转换为二进制
        String binary = Integer.toBinaryString(Integer.parseInt(s));
        int len = binary.length();
        StringBuilder sb = new StringBuilder();
        for (int i = len; i > 0;) {
            String str;
            if(i - 7 > 0) {
                str = "1" + binary.substring(i - 7, i);
            }else {
                str = "00000000" + binary.substring(0, i);
                str = str.substring(str.length() - 8);
            }
            int a = Integer.parseInt(str, 2);
            String s1 = Integer.toHexString(a).toUpperCase();
            if(s1.length() == 1) {
                s1 = "0" + s1;
            }
            sb.append(s1);
            i = i - 7;
        }
        System.out.println(sb);
    }
}
